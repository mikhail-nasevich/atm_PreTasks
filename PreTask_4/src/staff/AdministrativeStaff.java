package staff;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;



public class AdministrativeStaff extends ParkStaff {

    public AdministrativeStaff(String name, String surname, int id, double salary) {
        super(name, surname, id, salary);
    }

    public static void addPeople()
            throws IOException, ParserConfigurationException, SAXException {
        File newStaff = new File("newStaff.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(newStaff);
        doc.getDocumentElement().normalize();
        NodeList nList = doc.getElementsByTagName("person");
        for (int i = 0; i < nList.getLength(); i++) {
            Node node = nList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) node;

                String name = eElement.getElementsByTagName("name").item(0).getTextContent();
                String surname = eElement.getElementsByTagName("surname").item(0).getTextContent();
                int id = Integer.parseInt(eElement.getElementsByTagName("id").item(0).getTextContent());
                double salary = Double.parseDouble(eElement.getElementsByTagName("salary").item(0).getTextContent());

                AdministrativeStaff staff = new AdministrativeStaff(name, surname, id, salary);
                ParkStaff.addPeople(staff);

            }
        }


    }
}