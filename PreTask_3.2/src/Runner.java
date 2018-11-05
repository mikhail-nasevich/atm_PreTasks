import java.io.IOException;

public class Runner {


    public static void main(String[] args)
            throws NoCars, IOException {

        Taxis myTaxis= new Taxis();
        myTaxis.addCars();
        myTaxis.getAllCars();

        Dispatcher myDispatcher = new Dispatcher(myTaxis);
        myDispatcher.addOrder(113,"Nezavisimosti 186", 11, 3);
        myDispatcher.getOrder(112);


    }

}


