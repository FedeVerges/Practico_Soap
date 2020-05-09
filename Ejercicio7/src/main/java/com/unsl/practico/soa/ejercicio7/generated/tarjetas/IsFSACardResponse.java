
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
 *         &lt;element name="IsFSACardResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "isFSACardResult"
})
@XmlRootElement(name = "IsFSACardResponse")
public class IsFSACardResponse {

    @XmlElement(name = "IsFSACardResult")
    protected boolean isFSACardResult;

    /**
     * Gets the value of the isFSACardResult property.
     * 
     */
    public boolean isIsFSACardResult() {
        return isFSACardResult;
    }

    /**
     * Sets the value of the isFSACardResult property.
     * 
     */
    public void setIsFSACardResult(boolean value) {
        this.isFSACardResult = value;
    }

}
