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
 *             Performs actions on {@link Company} objects that match the given {@code Statement}.
 *             
 *             @param companyAction the action to perform
 *             @param statement a PQL statement used to filter companies
 *             @return the result of the action performed
 *             @throws ApiException
 *           
 * 
 * <p>Java class for performCompanyAction element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="performCompanyAction">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="companyAction" type="{https://www.google.com/apis/ads/publisher/v202108}CompanyAction" minOccurs="0"/>
 *           &lt;element name="statement" type="{https://www.google.com/apis/ads/publisher/v202108}Statement" minOccurs="0"/>
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
    "companyAction",
    "statement"
})
@XmlRootElement(name = "performCompanyAction")
public class CompanyServiceInterfaceperformCompanyAction {

    protected CompanyAction companyAction;
    protected Statement statement;

    /**
     * Gets the value of the companyAction property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyAction }
     *     
     */
    public CompanyAction getCompanyAction() {
        return companyAction;
    }

    /**
     * Sets the value of the companyAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyAction }
     *     
     */
    public void setCompanyAction(CompanyAction value) {
        this.companyAction = value;
    }

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
