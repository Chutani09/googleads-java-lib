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


package com.google.api.ads.admanager.jaxws.v202102;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Returns a page of {@link CmsMetadataValue}s matching the specified {@link Statement}. The
 *             following fields are supported for filtering:
 *             
 *             <table>
 *             <tr>
 *             <th scope = "col">PQL Property</th> <th scope="col">Object Property</th>
 *             </tr>
 *             <tr>
 *             <td>{@code id}</td>
 *             <td>{@link CmsMetadataValue#cmsMetadataValueId}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code cmsValue}</td>
 *             <td>{@link CmsMetadataValue#valueName}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code cmsKey}</td>
 *             <td>{@link CmsMetadataValue#key#name}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code cmsKeyId}</td>
 *             <td>{@link CmsMetadataValue#key#id}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code status}</td>
 *             <td>{@link CmsMetadataValue#status}</td>
 *             </tr>
 *             </table>
 *           
 * 
 * <p>Java class for getCmsMetadataValuesByStatement element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getCmsMetadataValuesByStatement">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="statement" type="{https://www.google.com/apis/ads/publisher/v202102}Statement" minOccurs="0"/>
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
    "statement"
})
@XmlRootElement(name = "getCmsMetadataValuesByStatement")
public class CmsMetadataServiceInterfacegetCmsMetadataValuesByStatement {

    protected Statement statement;

    /**
     * Gets the value of the statement property.
     * 
     * @return
     *     possible object is
     *     {@link Statement }
     *     
     */
    public Statement getStatement() {
        return statement;
    }

    /**
     * Sets the value of the statement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement }
     *     
     */
    public void setStatement(Statement value) {
        this.statement = value;
    }

}
