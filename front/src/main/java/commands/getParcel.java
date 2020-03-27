    package commands;


import api.PublicAPI;
import cli.framework.Command;
import stubs.delivery.Parcel;

import java.util.List;

public class getParcel extends Command<PublicAPI> {

    private String reference;

    @Override
    public String identifier() {
        return "parcel";
    }

    @Override
    public void execute() throws Exception {
        Parcel parcel = null;
        try {
            parcel=shell.system.deliverySystemWebService.getParcel(reference);
        } catch (Exception e) {
            System.out.println("Not available");
        }
        if(parcel!=null){
            System.out.println(parcel.toString());
        }
        else{
            System.out.println( "Not available");
        }

    }

    @Override
    public void load(List<String> args) { reference = args.get(0); }

    @Override
    public String describe() {
        return "Show a parcel for a given reference";
    }
}
