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


package com.google.api.ads.admanager.jaxws.v202108;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Gets a {@link LiveStreamEventPage} of {@link LiveStreamEvent} objects that
 *             satisfy the given {@link Statement#query}. The following fields are
 *             supported for filtering:
 *             
 *             <table>
 *             <tr>
 *             <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
 *             </tr>
 *             <tr>
 *             <td>{@code id}</td>
 *             <td>{@link LiveStreamEvent#id}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code slateCreativeId}</td>
 *             <td>{@link LiveStreamEvent#slateCreativeId}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code assetKey}</td>
 *             <td>{@link LiveStreamEvent#assetKey}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code streamCreateDaiAuthenticationKeyIds}</td>
 *             <td>{@link LiveStreamEvent#streamCreateDaiAuthenticationKeyIds}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code dynamicAdInsertionType}</td>
 *             <td>{@link LiveStreamEvent#dynamicAdInsertionType}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code streamingFormat}</td>
 *             <td>{@link LiveStreamEvent#streamingFormat}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code customAssetKey}</td>
 *             <td>{@link LiveStreamEvent#customAssetKey}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code daiEncodingProfileIds}</td>
 *             <td>{@link LiveStreamEvent#daiEncodingProfileIds}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code segmentUrlAuthenticationKeyIds}</td>
 *             <td>{@link LiveStreamEvent#segmentUrlAuthenticationKeyIds}</td>
 *             </tr>
 *             </table>
 *             
 *             @param filterStatement a Publisher Query Language statement to filter a
 *             list of live stream events
 *             @return the live stream events that match the filter
 *           
 * 
 * <p>Java class for getLiveStreamEventsByStatement element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getLiveStreamEventsByStatement">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="filterStatement" type="{https://www.google.com/apis/ads/publisher/v202108}Statement" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "filterStatement"
})
@XmlRootElement(name = "getLiveStreamEventsByStatement")
public class LiveStreamEventServiceInterfacegetLiveStreamEventsByStatement {

    protected Statement filterStatement;

    /**
     * Gets the value of the filterStatement property.
     * 
     * @return
     *     possible object is
     *     {@link Statement }
     *     
     */
    public Statement getFilterStatement() {
        return filterStatement;
    }

    /**
     * Sets the value of the filterStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement }
     *     
     */
    public void setFilterStatement(Statement value) {
        this.filterStatement = value;
    }

}
