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
 *             Performs action on {@link Creative} objects that match the given {@link Statement#query}.
 *             
 *             @param creativeAction the action to perform
 *             @param filterStatement a Publisher Query Language statement used to filter a set of creatives
 *             @return the result of the action performed
 *           
 * 
 * <p>Java class for performCreativeAction element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="performCreativeAction">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="creativeAction" type="{https://www.google.com/apis/ads/publisher/v202108}CreativeAction" minOccurs="0"/>
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
    "creativeAction",
    "filterStatement"
})
@XmlRootElement(name = "performCreativeAction")
public class CreativeServiceInterfaceperformCreativeAction {

    protected CreativeAction creativeAction;
    protected Statement filterStatement;

    /**
     * Gets the value of the creativeAction property.
     * 
     * @return
     *     possible object is
     *     {@link CreativeAction }
     *     
     */
    public CreativeAction getCreativeAction() {
        return creativeAction;
    }

    /**
     * Sets the value of the creativeAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreativeAction }
     *     
     */
    public void setCreativeAction(CreativeAction value) {
        this.creativeAction = value;
    }

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
