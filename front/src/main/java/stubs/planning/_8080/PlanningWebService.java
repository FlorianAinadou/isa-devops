package stubs.planning._8080;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.9
 * 2020-03-19T15:46:24.971+01:00
 * Generated source version: 2.7.9
 * 
 */
@WebService(targetNamespace = "http://localhost:8080", name = "PlanningWebService")
@XmlSeeAlso({ObjectFactory.class})
public interface PlanningWebService {

    @WebMethod
    @RequestWrapper(localName = "getParcel", targetNamespace = "http://localhost:8080", className = "localhost._8080.GetParcel")
    @ResponseWrapper(localName = "getParcelResponse", targetNamespace = "http://localhost:8080", className = "localhost._8080.GetParcelResponse")
    @WebResult(name = "parcel", targetNamespace = "")
    public Parcel getParcel(
        @WebParam(name = "parcelReference", targetNamespace = "")
        java.lang.String parcelReference
    );
}
