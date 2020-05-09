
package com.unsl.practico.soa.ejercicio7.generated.tarjetas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetNetworkIDResult" type="{http://localhost/SmartPayments/}Response" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getNetworkIDResult"
})
@XmlRootElement(name = "GetNetworkIDResponse")
public class GetNetworkIDResponse {

    @XmlElement(name = "GetNetworkIDResult")
    protected Response getNetworkIDResult;

    /**
     * Gets the value of the getNetworkIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link Response }
     *     
     */
    public Response getGetNetworkIDResult() {
        return getNetworkIDResult;
    }

    /**
     * Sets the value of the getNetworkIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Response }
     *     
     */
    public void setGetNetworkIDResult(Response value) {
        this.getNetworkIDResult = value;
    }

}
