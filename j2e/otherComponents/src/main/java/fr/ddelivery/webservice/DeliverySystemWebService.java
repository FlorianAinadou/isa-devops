package fr.ddelivery.webservice;

import fr.ddelivery.entities.Delivery;
import fr.ddelivery.entities.Parcel;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace = "http://localhost:8080")
public interface DeliverySystemWebService {

    @WebMethod
    @WebResult(name = "getParcel")
    public Parcel getParcel(@WebParam(name = "parcelReference") String parcelReference);


    @WebMethod
    public void initDatabase();

    @WebMethod
    @WebResult(name = "getNextDelivery")
    public Delivery getNextDelivery();


}
