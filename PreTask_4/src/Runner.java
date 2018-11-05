import org.xml.sax.SAXException;
import staff.AdministrativeStaff;
import staff.Drivers;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.sql.SQLException;

public class Runner {


    public static void main(String[] args)
            throws IOException, ParserConfigurationException, SAXException, SQLException, ClassNotFoundException {

    //    Taxis myTaxis= new Taxis();
    //    myTaxis.addCars();
    //    myTaxis.getAllCars();

    //    Dispatcher myDispatcher = new Dispatcher(myTaxis);
    //    myDispatcher.addOrder(113,"Nezavisimosti 186", 11, 3);
    //    myDispatcher.getOrder(112);

        AdministrativeStaff.addPeople();
        AdministrativeStaff.showStaff();

        System.out.println("\n");

        Drivers.getConnection();
        Drivers.getDrivers();



    }

}


