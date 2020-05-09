
package com.unsl.practico.soa.ejercicio7.generated.tarjetas;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CreditCardValidatorHttpGet", targetNamespace = "http://localhost/SmartPayments/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CreditCardValidatorHttpGet {


    /**
     * Returns the card issuer Visa, MasterCard, AMEX, etc., based  on the card number.
     * 
     * @param cardNumber
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetCardType")
    @WebResult(name = "Body", partName = "Body")
    public String getCardType(
        @WebParam(name = "CardNumber", partName = "CardNumber")
        String cardNumber);

    /**
     * Returns (T/F) if the card is a known commercial card (commercial cards require customer code and sales tax amount to receive preferred discount rate pricing.)
     * 
     * @param cardNumber
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "IsCommercialCard")
    @WebResult(name = "Body", partName = "Body")
    public boolean isCommercialCard(
        @WebParam(name = "CardNumber", partName = "CardNumber")
        String cardNumber);

    /**
     * Validates the credit card by checking the card length based on the card type, performs a mod 10 checksum and validates the expiration date. Returns 0 if good, 1001 - no card number, 1002 - no exp date, 1003 - invalid card type, 1004 - invalid card length, 1005 - bad mod 10 check, 1006 - bad expiration date.
     * 
     * @param cardNumber
     * @param expDate
     * @return
     *     returns int
     */
    @WebMethod(operationName = "ValidCard")
    @WebResult(name = "Body", partName = "Body")
    public int validCard(
        @WebParam(name = "CardNumber", partName = "CardNumber")
        String cardNumber,
        @WebParam(name = "ExpDate", partName = "ExpDate")
        String expDate);

    /**
     * Validates the credit card length by checking the card length based on the card type, Returns (T/F).
     * 
     * @param cardNumber
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "ValidCardLength")
    @WebResult(name = "Body", partName = "Body")
    public boolean validCardLength(
        @WebParam(name = "CardNumber", partName = "CardNumber")
        String cardNumber);

    /**
     * Validates the expiration date by making sure it is a valid date and the card has not expired, Returns (T/F).
     * 
     * @param expDate
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "ValidExpDate")
    @WebResult(name = "Body", partName = "Body")
    public boolean validExpDate(
        @WebParam(name = "ExpDate", partName = "ExpDate")
        String expDate);

    /**
     * Validates the credit card by performing a mod 10 checksum on the card number, Returns (T/F).
     * 
     * @param cardNumber
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "ValidMod10")
    @WebResult(name = "Body", partName = "Body")
    public boolean validMod10(
        @WebParam(name = "CardNumber", partName = "CardNumber")
        String cardNumber);

    /**
     * Lookup the Debit Network ID using a Card Number. Network ID is a 3 characters string. If there is a match, the card can likely be used as a Debit Card and processed through the Debit network. Possible Network ID: ACL – Accel, AFN - AFFN, AKO – Alaska Option, C24 – CU24, ILK – Interlink, JEN - Jeanie, MAC – Star Northeast (MAC), MAE – Maestro, NET - NETS, NYC – NYCE, PUL – Pulse, SES – Star Southeast, SHZ – Shazam, STX – Star West, TYM - TYME
     * 
     * @param password
     * @param userName
     * @param cardNumber
     * @return
     *     returns com.unsl.practico.soa.ejercicio7.generated.tarjetas.Response
     */
    @WebMethod(operationName = "GetNetworkID")
    @WebResult(name = "Body", partName = "Body")
    public Response getNetworkID(
        @WebParam(name = "UserName", partName = "UserName")
        String userName,
        @WebParam(name = "Password", partName = "Password")
        String password,
        @WebParam(name = "CardNumber", partName = "CardNumber")
        String cardNumber);

    /**
     * Returns (T/F) if the card is a known FSA card.
     * 
     * @param vendor
     * @param pnRef
     * @param ccInfoKey
     * @param cardNumber
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "IsFSACard")
    @WebResult(name = "Body", partName = "Body")
    public boolean isFSACard(
        @WebParam(name = "CardNumber", partName = "CardNumber")
        String cardNumber,
        @WebParam(name = "PNRef", partName = "PNRef")
        String pnRef,
        @WebParam(name = "Vendor", partName = "Vendor")
        String vendor,
        @WebParam(name = "CcInfoKey", partName = "CcInfoKey")
        String ccInfoKey);

    /**
     * Returns (T/F) if the routing number is present in the routing table.
     * 
     * @param routingNumber
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "IsValidCheckRoutingNumber")
    @WebResult(name = "Body", partName = "Body")
    public boolean isValidCheckRoutingNumber(
        @WebParam(name = "RoutingNumber", partName = "RoutingNumber")
        String routingNumber);

    /**
     * Returns an XMLDocument with the following nodes:  - IsDebit: (T/F) if the routing number is present in the debit table. - CardType: The card type associated with the card number.
     * 
     * @param cardNumber
     */
    @WebMethod(operationName = "IsDebitCard")
    public void isDebitCard(
        @WebParam(name = "CardNumber", partName = "CardNumber")
        String cardNumber);

}
