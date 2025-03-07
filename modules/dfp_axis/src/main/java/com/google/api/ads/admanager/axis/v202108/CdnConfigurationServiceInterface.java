// Copyright 2021 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * CdnConfigurationServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202108;

public interface CdnConfigurationServiceInterface extends java.rmi.Remote {

    /**
     * Creates new {@link CdnConfiguration} objects.
     */
    public com.google.api.ads.admanager.axis.v202108.CdnConfiguration[] createCdnConfigurations(com.google.api.ads.admanager.axis.v202108.CdnConfiguration[] cdnConfigurations) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202108.ApiException;

    /**
     * Gets a {@link CdnConfigurationPage} of {@link CdnConfiguration}
     * objects that satisfy the given
     *         {@link Statement#query}. Currently only CDN Configurations
     * of type {@link
     *         CdnConfigurationType#LIVE_STREAM_SOURCE_CONTENT} will be returned.
     * The following fields are
     *         supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link CdnConfiguration#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link CdnConfiguration#name}</td>
     *         </tr>
     *         </table>
     */
    public com.google.api.ads.admanager.axis.v202108.CdnConfigurationPage getCdnConfigurationsByStatement(com.google.api.ads.admanager.axis.v202108.Statement statement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202108.ApiException;

    /**
     * Performs actions on {@link CdnConfiguration} objects that match
     * the given {@link
     *         Statement#query}.
     *         
     *         
     * @param cdnConfigurationAction the action to perform
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter a set of live stream
     *         events
     *         
     * @return the result of the action performed
     */
    public com.google.api.ads.admanager.axis.v202108.UpdateResult performCdnConfigurationAction(com.google.api.ads.admanager.axis.v202108.CdnConfigurationAction cdnConfigurationAction, com.google.api.ads.admanager.axis.v202108.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202108.ApiException;

    /**
     * Updates the specified {@link CdnConfiguration} objects.
     */
    public com.google.api.ads.admanager.axis.v202108.CdnConfiguration[] updateCdnConfigurations(com.google.api.ads.admanager.axis.v202108.CdnConfiguration[] cdnConfigurations) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202108.ApiException;
}
