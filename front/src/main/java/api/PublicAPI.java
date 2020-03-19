package api;


import stubs.plannings.PlanningWebService;
import stubs.plannings.PlanningWebServiceImplService;

import javax.xml.ws.BindingProvider;
import java.net.URL;

public class PublicAPI {

    public PlanningWebService planningWebService;

    public PublicAPI(String host, String port){
        URL wsdlLocation = PublicAPI.class.getResource("/PlanningWebServiceImpl.wsdl");
        PlanningWebServiceImplService factory = new PlanningWebServiceImplService();
        planningWebService= factory.getPlanningWebServiceImplPort();
        String address= "http://" + host + ":" + port + "/j2e-1.0-SNAPSHOT/webservices/PlanningWs" ;
        ((BindingProvider)planningWebService).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address);
    }
}
