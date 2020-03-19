package webservice;

import entities.Parcel;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.Date;

@WebService(targetNamespace = "http://localhost:8080")
public interface DeliverySystemWebService {

    @WebMethod
    @WebResult(name = "parcel")
    default Parcel getParcel(@WebParam(name = "parcelReference") String parcelReference) {
        return null;
    }


    @WebMethod
    void initDatabase();

}
