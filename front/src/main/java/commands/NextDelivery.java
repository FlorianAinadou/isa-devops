package commands;

import api.PublicAPI;
import cli.framework.Command;
import stubs.delivery.Delivery;
import stubs.delivery.Parcel;

public class NextDelivery extends Command<PublicAPI> {
    @Override
    public String identifier() {
        return "getNextDelivery";
    }

    @Override
    public void execute() throws Exception {
        Delivery delivery = null;
        try {
            delivery=shell.system.deliverySystemWebService.getNextDelivery();
        } catch (Exception e) {
            System.out.println("There is no further delivery");
        }
        if(delivery!=null){
            System.out.println(delivery.toString());
        }
        else{
            System.out.println("There is no further delivery");
        }

    }

    @Override
    public String describe() {
        return "Return the next delivery ";
    }
}
