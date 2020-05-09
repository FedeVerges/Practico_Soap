
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
 *         &lt;element name="ValidCardLengthResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "validCardLengthResult"
})
@XmlRootElement(name = "ValidCardLengthResponse")
public class ValidCardLengthResponse {

    @XmlElement(name = "ValidCardLengthResult")
    protected boolean validCardLengthResult;

    /**
     * Gets the value of the validCardLengthResult property.
     * 
     */
    public boolean isValidCardLengthResult() {
        return validCardLengthResult;
    }

    /**
     * Sets the value of the validCardLengthResult property.
     * 
     */
    public void setValidCardLengthResult(boolean value) {
        this.validCardLengthResult = value;
    }

}
