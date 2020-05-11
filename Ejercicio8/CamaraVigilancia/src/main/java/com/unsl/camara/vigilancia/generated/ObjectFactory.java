
package com.unsl.camara.vigilancia.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.unsl.camara.vigilancia.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _NotificarEmergencia_QNAME = new QName("http://emergencia.servicio.unsl.com/", "notificarEmergencia");
    private final static QName _NotificarEmergenciaResponse_QNAME = new QName("http://emergencia.servicio.unsl.com/", "notificarEmergenciaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.unsl.camara.vigilancia.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NotificarEmergencia }
     * 
     */
    public NotificarEmergencia createNotificarEmergencia() {
        return new NotificarEmergencia();
    }

    /**
     * Create an instance of {@link NotificarEmergenciaResponse }
     * 
     */
    public NotificarEmergenciaResponse createNotificarEmergenciaResponse() {
        return new NotificarEmergenciaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificarEmergencia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://emergencia.servicio.unsl.com/", name = "notificarEmergencia")
    public JAXBElement<NotificarEmergencia> createNotificarEmergencia(NotificarEmergencia value) {
        return new JAXBElement<NotificarEmergencia>(_NotificarEmergencia_QNAME, NotificarEmergencia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificarEmergenciaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://emergencia.servicio.unsl.com/", name = "notificarEmergenciaResponse")
    public JAXBElement<NotificarEmergenciaResponse> createNotificarEmergenciaResponse(NotificarEmergenciaResponse value) {
        return new JAXBElement<NotificarEmergenciaResponse>(_NotificarEmergenciaResponse_QNAME, NotificarEmergenciaResponse.class, null, value);
    }

}
