package stubs.delivery;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.9
 * 2020-03-20T08:25:20.903+01:00
 * Generated source version: 2.7.9
 *
 */
@WebServiceClient(name = "DeliverySystemWebServiceImplService",
        wsdlLocation = "./src/main/resources/DeliverySystemWebServiceImpl.wsdl",
        targetNamespace = "http://localhost:8080")
public class DeliverySystemWebServiceImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://localhost:8080", "DeliverySystemWebServiceImplService");
    public final static QName DeliverySystemWebServiceImplPort = new QName("http://localhost:8080", "DeliverySystemWebServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("./src/main/resources/DeliverySystemWebServiceImpl.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(DeliverySystemWebServiceImplService.class.getName())
                    .log(java.util.logging.Level.INFO,
                            "Can not initialize the default wsdl from {0}", "./src/main/resources/DeliverySystemWebServiceImpl.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public DeliverySystemWebServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public DeliverySystemWebServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DeliverySystemWebServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public DeliverySystemWebServiceImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public DeliverySystemWebServiceImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public DeliverySystemWebServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns DeliverySystemWebService
     */
    @WebEndpoint(name = "DeliverySystemWebServiceImplPort")
    public DeliverySystemWebService getDeliverySystemWebServiceImplPort() {
        return super.getPort(DeliverySystemWebServiceImplPort, DeliverySystemWebService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DeliverySystemWebService
     */
    @WebEndpoint(name = "DeliverySystemWebServiceImplPort")
    public DeliverySystemWebService getDeliverySystemWebServiceImplPort(WebServiceFeature... features) {
        return super.getPort(DeliverySystemWebServiceImplPort, DeliverySystemWebService.class, features);
    }

}