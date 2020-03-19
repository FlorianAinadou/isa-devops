package utils;

import exceptions.ExternalPartnerException;
import org.apache.cxf.jaxrs.client.WebClient;
import org.json.JSONObject;

import javax.ws.rs.core.MediaType;


public class CarrierAPI {

	private String url;

	public CarrierAPI(String host, String port) {
		this.url = "http://" + host + ":" + port;
	}

	public CarrierAPI() { this("localhost", "9090"); }

	public boolean postBill(double value) throws ExternalPartnerException {
		// Building bill request
		JSONObject request = new JSONObject();

		// Sending a Bill request to the mailbox
		Integer id;
		try {
			String str = WebClient.create(url).path("/mailbox")
					.accept(MediaType.APPLICATION_JSON_TYPE).header("Content-Type", MediaType.APPLICATION_JSON)
					.post(request.toString(), String.class);
			id = Integer.parseInt(str);
		} catch (Exception e) {
			throw new ExternalPartnerException(url+"/mailbox", e);
		}

		// Retrieving the bill status
		JSONObject bill;
		try {
			String response = WebClient.create(url).path("/bills/" + id).get(String.class);
			bill = new JSONObject(response);
		} catch (Exception e) {
			throw new ExternalPartnerException(url + "bills/" + id, e);
		}
		// Assessing the bill status
		return (bill.getInt("Status") == 0);
	}

}
