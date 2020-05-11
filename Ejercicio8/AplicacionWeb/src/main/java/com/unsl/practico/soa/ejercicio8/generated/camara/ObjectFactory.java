
package com.unsl.practico.soa.ejercicio8.generated.camara;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.unsl.practico.soa.ejercicio8.generated.camara package. 
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

    private final static QName _ObtenerStreaming_QNAME = new QName("http://vigilancia.camara.unsl.com/", "obtenerStreaming");
    private final static QName _ObtenerStreamingResponse_QNAME = new QName("http://vigilancia.camara.unsl.com/", "obtenerStreamingResponse");
    private final static QName _Streaming_QNAME = new QName("http://vigilancia.camara.unsl.com/", "streaming");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.unsl.practico.soa.ejercicio8.generated.camara
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Streaming }
     * 
     */
    public Streaming createStreaming() {
        return new Streaming();
    }

    /**
     * Create an instance of {@link ObtenerStreamingResponse }
     * 
     */
    public ObtenerStreamingResponse createObtenerStreamingResponse() {
        return new ObtenerStreamingResponse();
    }

    /**
     * Create an instance of {@link ObtenerStreaming }
     * 
     */
    public ObtenerStreaming createObtenerStreaming() {
        return new ObtenerStreaming();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerStreaming }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vigilancia.camara.unsl.com/", name = "obtenerStreaming")
    public JAXBElement<ObtenerStreaming> createObtenerStreaming(ObtenerStreaming value) {
        return new JAXBElement<ObtenerStreaming>(_ObtenerStreaming_QNAME, ObtenerStreaming.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerStreamingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vigilancia.camara.unsl.com/", name = "obtenerStreamingResponse")
    public JAXBElement<ObtenerStreamingResponse> createObtenerStreamingResponse(ObtenerStreamingResponse value) {
        return new JAXBElement<ObtenerStreamingResponse>(_ObtenerStreamingResponse_QNAME, ObtenerStreamingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Streaming }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vigilancia.camara.unsl.com/", name = "streaming")
    public JAXBElement<Streaming> createStreaming(Streaming value) {
        return new JAXBElement<Streaming>(_Streaming_QNAME, Streaming.class, null, value);
    }

}
