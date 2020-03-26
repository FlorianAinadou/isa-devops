
package stubs.delivery;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the stubs.delivery package. 
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

    private final static QName _GetParcelResponse_QNAME = new QName("http://localhost:8080", "getParcelResponse");
    private final static QName _GetParcel_QNAME = new QName("http://localhost:8080", "getParcel");
    private final static QName _InitDatabase_QNAME = new QName("http://localhost:8080", "initDatabase");
    private final static QName _InitDatabaseResponse_QNAME = new QName("http://localhost:8080", "initDatabaseResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: stubs.delivery
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetParcel }
     * 
     */
    public GetParcel createGetParcel() {
        return new GetParcel();
    }

    /**
     * Create an instance of {@link GetParcelResponse }
     * 
     */
    public GetParcelResponse createGetParcelResponse() {
        return new GetParcelResponse();
    }

    /**
     * Create an instance of {@link Parcel }
     * 
     */
    public Parcel createParcel() {
        return new Parcel();
    }

    /**
     * Create an instance of {@link InitDatabase }
     * 
     */
    public InitDatabase createInitDatabase() {
        return new InitDatabase();
    }

    /**
     * Create an instance of {@link InitDatabaseResponse }
     * 
     */
    public InitDatabaseResponse createInitDatabaseResponse() {
        return new InitDatabaseResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetParcelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:8080", name = "getParcelResponse")
    public JAXBElement<GetParcelResponse> createGetParcelResponse(GetParcelResponse value) {
        return new JAXBElement<GetParcelResponse>(_GetParcelResponse_QNAME, GetParcelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetParcel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:8080", name = "getParcel")
    public JAXBElement<GetParcel> createGetParcel(GetParcel value) {
        return new JAXBElement<GetParcel>(_GetParcel_QNAME, GetParcel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitDatabase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:8080", name = "initDatabase")
    public JAXBElement<InitDatabase> createInitDatabase(InitDatabase value) {
        return new JAXBElement<InitDatabase>(_InitDatabase_QNAME, InitDatabase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitDatabaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:8080", name = "initDatabaseResponse")
    public JAXBElement<InitDatabaseResponse> createInitDatabaseResponse(InitDatabaseResponse value) {
        return new JAXBElement<InitDatabaseResponse>(_InitDatabaseResponse_QNAME, InitDatabaseResponse.class, null, value);
    }

}
