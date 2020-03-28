package fr.ddelivery.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace = "http://localhost:8080/bill")
public interface BillService {

	@WebMethod
	@WebResult(name = "cart_contents")
	String sendBill(@WebParam(name = "bill_amount") String amount)
			throws Exception;

}
