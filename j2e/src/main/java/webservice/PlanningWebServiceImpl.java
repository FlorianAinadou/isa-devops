package webservice;

import components.Planning;
import entities.Parcel;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

@WebService(targetNamespace = "http://localhost:8080")
@Stateless(name = "PlanningWs")
public class PlanningWebServiceImpl implements PlanningWebService {

    @EJB(name = "stateless-planning") Planning planning;

    @Override
    public Parcel getParcel(String packageReference) {
       return planning.getParcel(packageReference);
    }

    @Override
    public void initDatabase() {
        System.out.println("a\n");
        planning.initDatabase();
    }
}
