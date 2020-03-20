package fr.ddelivery.webservice;



import fr.ddelivery.utils.CarrierAPI;

import javax.ejb.Stateless;
import javax.jws.WebService;

@WebService(targetNamespace = "http://localhost:8080/bill")
@Stateless(name = "BillWS")
public class BillServiceImpl implements BillService {


	@Override
	public String sendBill(String amount) throws Exception {
		    CarrierAPI carrierAPI = new CarrierAPI();
		    carrierAPI.postBill(amount);
		    return "ok";
	}
}
