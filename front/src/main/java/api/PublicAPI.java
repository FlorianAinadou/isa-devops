package api;


import stubs.billing.BillService;
import stubs.billing.BillServiceImplService;
import stubs.delivery.DeliverySystemWebService;
import stubs.delivery.DeliverySystemWebServiceImplService;


import javax.xml.ws.BindingProvider;
import java.net.URL;

public class PublicAPI {

    public DeliverySystemWebService deliverySystemWebService;
    public BillService billingWebService;

    public PublicAPI(String host, String port){
        URL wsdlLocation = PublicAPI.class.getResource("DeliverySystemWebServiceImpl.wsdl");
        DeliverySystemWebServiceImplService factory = new DeliverySystemWebServiceImplService();
        deliverySystemWebService = factory.getDeliverySystemWebServiceImplPort();
        String address= "http://" + host + ":" + port + "/j2e-1.0-SNAPSHOT/webservices/PlanningWs" ;
        ((BindingProvider) deliverySystemWebService).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address);
        URL wsdlLocationBill = PublicAPI.class.getResource("/BillServiceImpl.wsdl");
        BillServiceImplService factory2 = new BillServiceImplService();
        billingWebService = factory2.getBillServiceImplPort();
        String address2= "http://" + host + ":" + port + "/j2e-1.0-SNAPSHOT/webservices/BillWS" ;
        ((BindingProvider)billingWebService).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address2);

    }
}
