package api;


import stubs.delivery.DeliverySystemWebService;
import stubs.delivery.DeliverySystemWebServiceImplService;


import javax.xml.ws.BindingProvider;
import java.net.URL;

public class PublicAPI {

    public DeliverySystemWebService deliverySystemWebService;

    public PublicAPI(String host, String port){
        URL wsdlLocation = PublicAPI.class.getResource("/PlanningWebServiceImpl.wsdl");
        DeliverySystemWebServiceImplService factory = new DeliverySystemWebServiceImplService();
        deliverySystemWebService = factory.getDeliverySystemWebServiceImplPort();
        String address= "http://" + host + ":" + port + "/j2e-1.0-SNAPSHOT/webservices/PlanningWs" ;
        ((BindingProvider) deliverySystemWebService).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address);
    }
}
