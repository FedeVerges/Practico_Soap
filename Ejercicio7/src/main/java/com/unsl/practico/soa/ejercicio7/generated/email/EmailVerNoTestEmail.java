
package com.unsl.practico.soa.ejercicio7.generated.email;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * These functions deal with Email Address Verification.  <b>CDYNE advertises a 100% SLA.  Try to find that kind of SLA from other web service vendors!</b>
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "EmailVerNoTestEmail", targetNamespace = "http://ws.cdyne.com/", wsdlLocation = "http://ws.cdyne.com/emailverify/Emailvernotestemail.asmx?wsdl")
public class EmailVerNoTestEmail
    extends Service
{

    private final static URL EMAILVERNOTESTEMAIL_WSDL_LOCATION;
    private final static WebServiceException EMAILVERNOTESTEMAIL_EXCEPTION;
    private final static QName EMAILVERNOTESTEMAIL_QNAME = new QName("http://ws.cdyne.com/", "EmailVerNoTestEmail");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://ws.cdyne.com/emailverify/Emailvernotestemail.asmx?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EMAILVERNOTESTEMAIL_WSDL_LOCATION = url;
        EMAILVERNOTESTEMAIL_EXCEPTION = e;
    }

    public EmailVerNoTestEmail() {
        super(__getWsdlLocation(), EMAILVERNOTESTEMAIL_QNAME);
    }

    public EmailVerNoTestEmail(WebServiceFeature... features) {
        super(__getWsdlLocation(), EMAILVERNOTESTEMAIL_QNAME, features);
    }

    public EmailVerNoTestEmail(URL wsdlLocation) {
        super(wsdlLocation, EMAILVERNOTESTEMAIL_QNAME);
    }

    public EmailVerNoTestEmail(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EMAILVERNOTESTEMAIL_QNAME, features);
    }

    public EmailVerNoTestEmail(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EmailVerNoTestEmail(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns EmailVerNoTestEmailSoap
     */
    @WebEndpoint(name = "EmailVerNoTestEmailSoap")
    public EmailVerNoTestEmailSoap getEmailVerNoTestEmailSoap() {
        return super.getPort(new QName("http://ws.cdyne.com/", "EmailVerNoTestEmailSoap"), EmailVerNoTestEmailSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EmailVerNoTestEmailSoap
     */
    @WebEndpoint(name = "EmailVerNoTestEmailSoap")
    public EmailVerNoTestEmailSoap getEmailVerNoTestEmailSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.cdyne.com/", "EmailVerNoTestEmailSoap"), EmailVerNoTestEmailSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns EmailVerNoTestEmailSoap
     */
    @WebEndpoint(name = "EmailVerNoTestEmailSoap12")
    public EmailVerNoTestEmailSoap getEmailVerNoTestEmailSoap12() {
        return super.getPort(new QName("http://ws.cdyne.com/", "EmailVerNoTestEmailSoap12"), EmailVerNoTestEmailSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EmailVerNoTestEmailSoap
     */
    @WebEndpoint(name = "EmailVerNoTestEmailSoap12")
    public EmailVerNoTestEmailSoap getEmailVerNoTestEmailSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.cdyne.com/", "EmailVerNoTestEmailSoap12"), EmailVerNoTestEmailSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns EmailVerNoTestEmailHttpGet
     */
    @WebEndpoint(name = "EmailVerNoTestEmailHttpGet")
    public EmailVerNoTestEmailHttpGet getEmailVerNoTestEmailHttpGet() {
        return super.getPort(new QName("http://ws.cdyne.com/", "EmailVerNoTestEmailHttpGet"), EmailVerNoTestEmailHttpGet.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EmailVerNoTestEmailHttpGet
     */
    @WebEndpoint(name = "EmailVerNoTestEmailHttpGet")
    public EmailVerNoTestEmailHttpGet getEmailVerNoTestEmailHttpGet(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.cdyne.com/", "EmailVerNoTestEmailHttpGet"), EmailVerNoTestEmailHttpGet.class, features);
    }

    /**
     * 
     * @return
     *     returns EmailVerNoTestEmailHttpPost
     */
    @WebEndpoint(name = "EmailVerNoTestEmailHttpPost")
    public EmailVerNoTestEmailHttpPost getEmailVerNoTestEmailHttpPost() {
        return super.getPort(new QName("http://ws.cdyne.com/", "EmailVerNoTestEmailHttpPost"), EmailVerNoTestEmailHttpPost.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EmailVerNoTestEmailHttpPost
     */
    @WebEndpoint(name = "EmailVerNoTestEmailHttpPost")
    public EmailVerNoTestEmailHttpPost getEmailVerNoTestEmailHttpPost(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.cdyne.com/", "EmailVerNoTestEmailHttpPost"), EmailVerNoTestEmailHttpPost.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EMAILVERNOTESTEMAIL_EXCEPTION!= null) {
            throw EMAILVERNOTESTEMAIL_EXCEPTION;
        }
        return EMAILVERNOTESTEMAIL_WSDL_LOCATION;
    }

}
