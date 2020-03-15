package webservice;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.Date;

@WebService(targetNamespace = "http://localhost:8080")
public interface PlanningWebService {

    @WebMethod
    @WebResult (name="package")
    void getPackage (@WebParam(name = "packageReference") String packageReference);


}
