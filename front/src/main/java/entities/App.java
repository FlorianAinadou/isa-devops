package entities;

import stubs.planning._8080.PlanningWebService;
import stubs.planning._8080.PlanningWebServiceImplService;

import java.net.URL;


public class App 
{
    public static void main( String[] args ){

       PlanningWebService ws =initialize();

       System.out.println(ws.getParcel("abcd"));



    }

public static PlanningWebService initialize(){
    System.out.println("#### Instantiating the WS Proxy");
    PlanningWebServiceImplService factory= new PlanningWebServiceImplService();
    PlanningWebService ws=factory.getPlanningWebServiceImplPort();
    return ws;
}

}
