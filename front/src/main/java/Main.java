import api.PublicAPI;
import cli.framework.Shell;
import commands.getParcel;
import commands.initDatabase;

public class Main extends Shell<PublicAPI> {

    public Main(String host, String port) {

        this.system  = new PublicAPI(host, port);
        this.invite  = "Delivery System";

        // Registering the command available for the user
        register(
                //getting parcel from reference
                getParcel.class,
                //init database
                initDatabase.class
                /*
                // Getting out of here
                Bye.class,
                // Handling customer
                RegisterCustomer.class,
                // Cookie catalogue
                ListCatalogueContents.class,
                // Cart management
                ShowCart.class, OrderCookie.class, RemoveCookie.class, ProcessCart.class,
                // Order tracking
                TrackOrder.class,
                // Play capability
                Play.class*/
        );
    }





    public static void main( String[] args )
    {
        String host = ( args.length == 0 ? "localhost" : args[0] );
        String port = ( args.length < 2  ? "8080"      : args[1] );
        System.out.println("\n\nDelivery Service");
        System.out.println("  - Remote server: " + host);
        System.out.println("  - Port number:   " + port);
        Main main = new Main(host, port);
        main.run();
        System.out.println("Let's go\n\n");
    }
}
