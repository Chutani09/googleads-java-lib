// Copyright 2015 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package admanager.axis.v202108.activityservice;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.beust.jcommander.Parameter;
import com.google.api.ads.admanager.axis.factory.AdManagerServices;
import com.google.api.ads.admanager.axis.v202108.Activity;
import com.google.api.ads.admanager.axis.v202108.ActivityServiceInterface;
import com.google.api.ads.admanager.axis.v202108.ActivityType;
import com.google.api.ads.admanager.axis.v202108.ApiError;
import com.google.api.ads.admanager.axis.v202108.ApiException;
import com.google.api.ads.admanager.lib.client.AdManagerSession;
import com.google.api.ads.admanager.lib.utils.examples.ArgumentNames;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.client.auth.oauth2.Credential;
import java.rmi.RemoteException;
import java.util.Random;

/**
 * This example creates new activities. To determine which activities exist, run
 * GetAllActivities.java.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file.
 * See README for more info.
 */
public class CreateActivities {

  private static class CreateActivitiesParams extends CodeSampleParams {
    @Parameter(
        names = ArgumentNames.ACTIVITY_GROUP_ID,
        required = true,
        description = "The ID of the activity group to create the activities for.")
    private Long activityGroupId;
  }

  /**
   * Runs the example.
   *
   * @param adManagerServices the services factory.
   * @param session the session.
   * @param activityGroupId the ID of the activity group to create the activities for.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(
      AdManagerServices adManagerServices, AdManagerSession session, long activityGroupId)
      throws RemoteException {
    // Get the ActivityService.
    ActivityServiceInterface activityService =
        adManagerServices.get(session, ActivityServiceInterface.class);

    // Create a daily visits activity.
    Activity dailyVisitsActivity = new Activity();
    dailyVisitsActivity.setName("Activity #" + new Random().nextInt(Integer.MAX_VALUE));
    dailyVisitsActivity.setActivityGroupId(activityGroupId);
    dailyVisitsActivity.setType(ActivityType.DAILY_VISITS);

    // Create a custom activity.
    Activity customActivity = new Activity();
    customActivity.setName("Activity #" + new Random().nextInt(Integer.MAX_VALUE));
    customActivity.setActivityGroupId(activityGroupId);
    customActivity.setType(ActivityType.CUSTOM);

    // Create the activities on the server.
    Activity[] activities =
        activityService.createActivities(new Activity[] {dailyVisitsActivity, customActivity});

    for (Activity createdActivity : activities) {
      System.out.printf(
          "An activity with ID %d, name '%s', and type '%s' was created.%n",
          createdActivity.getId(), createdActivity.getName(), createdActivity.getType());
    }
  }

  public static void main(String[] args) {
    AdManagerSession session;
    try {
      // Generate a refreshable OAuth2 credential.
      Credential oAuth2Credential =
          new OfflineCredentials.Builder()
              .forApi(Api.AD_MANAGER)
              .fromFile()
              .build()
              .generateCredential();

      // Construct a AdManagerSession.
      session =
          new AdManagerSession.Builder().fromFile().withOAuth2Credential(oAuth2Credential).build();
    } catch (ConfigurationLoadException cle) {
      System.err.printf(
          "Failed to load configuration from the %s file. Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, cle);
      return;
    } catch (ValidationException ve) {
      System.err.printf(
          "Invalid configuration in the %s file. Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, ve);
      return;
    } catch (OAuthException oe) {
      System.err.printf(
          "Failed to create OAuth credentials. Check OAuth settings in the %s file. "
              + "Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, oe);
      return;
    }

    AdManagerServices adManagerServices = new AdManagerServices();

    CreateActivitiesParams params = new CreateActivitiesParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.activityGroupId = Long.valueOf("INSERT_ACTIVITY_GROUP_ID_HERE");
    }

    try {
      runExample(adManagerServices, session, params.activityGroupId);
    } catch (ApiException apiException) {
      // ApiException is the base class for most exceptions thrown by an API request. Instances
      // of this exception have a message and a collection of ApiErrors that indicate the
      // type and underlying cause of the exception. Every exception object in the admanager.axis
      // packages will return a meaningful value from toString
      //
      // ApiException extends RemoteException, so this catch block must appear before the
      // catch block for RemoteException.
      System.err.println("Request failed due to ApiException. Underlying ApiErrors:");
      if (apiException.getErrors() != null) {
        int i = 0;
        for (ApiError apiError : apiException.getErrors()) {
          System.err.printf("  Error %d: %s%n", i++, apiError);
        }
      }
    } catch (RemoteException re) {
      System.err.printf("Request failed unexpectedly due to RemoteException: %s%n", re);
    }
  }
}
