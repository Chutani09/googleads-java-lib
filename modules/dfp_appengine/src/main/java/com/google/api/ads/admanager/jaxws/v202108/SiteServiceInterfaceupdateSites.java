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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Updates the specified {@link Site} objects.
 *             
 *             <p>The {@link Site#childNetworkCode} can be updated in order to 1) change the child network, 2)
 *             move a site from O&O to represented, or 3) move a site from represented to O&O.
 *             
 *             @param sites the sites to update
 *             @return the updated sites
 *           
 * 
 * <p>Java class for updateSites element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="updateSites">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="sites" type="{https://www.google.com/apis/ads/publisher/v202108}Site" maxOccurs="unbounded" minOccurs="0"/>
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
    "sites"
})
@XmlRootElement(name = "updateSites")
public class SiteServiceInterfaceupdateSites {

    protected List<Site> sites;

    /**
     * Gets the value of the sites property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sites property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSites().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Site }
     * 
     * 
     */
    public List<Site> getSites() {
        if (sites == null) {
            sites = new ArrayList<Site>();
        }
        return this.sites;
    }

}
