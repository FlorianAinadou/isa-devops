
package stubs.billing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the stubs.billing package. 
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

    private final static QName _Exception_QNAME = new QName("http://localhost:8080/bill", "Exception");
    private final static QName _SendBill_QNAME = new QName("http://localhost:8080/bill", "sendBill");
    private final static QName _SendBillResponse_QNAME = new QName("http://localhost:8080/bill", "sendBillResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: stubs.billing
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SendBillResponse }
     * 
     */
    public SendBillResponse createSendBillResponse() {
        return new SendBillResponse();
    }

    /**
     * Create an instance of {@link SendBill }
     * 
     */
    public SendBill createSendBill() {
        return new SendBill();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:8080/bill", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendBill }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:8080/bill", name = "sendBill")
    public JAXBElement<SendBill> createSendBill(SendBill value) {
        return new JAXBElement<SendBill>(_SendBill_QNAME, SendBill.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendBillResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:8080/bill", name = "sendBillResponse")
    public JAXBElement<SendBillResponse> createSendBillResponse(SendBillResponse value) {
        return new JAXBElement<SendBillResponse>(_SendBillResponse_QNAME, SendBillResponse.class, null, value);
    }

}
