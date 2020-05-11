
package com.unsl.camara.vigilancia.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for notificarEmergencia complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="notificarEmergencia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="detalles" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notificarEmergencia", propOrder = {
    "detalles"
})
public class NotificarEmergencia {

    @XmlElement(required = true)
    protected String detalles;

    /**
     * Gets the value of the detalles property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetalles() {
        return detalles;
    }

    /**
     * Sets the value of the detalles property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetalles(String value) {
        this.detalles = value;
    }

}
