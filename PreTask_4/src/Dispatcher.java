import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Dispatcher {

    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date date = new Date();
    int price = 2;
    CarsStorage cars;

    public double getTotal(int distance, int price){
        return price*distance;
    }

    public Dispatcher(CarsStorage c){
        cars =c;

    }


    public void addOrder(int orderNumber, String address, int distance, int index ) throws IOException, NoCars {

        File order = new File("order"+orderNumber);
        if(order.createNewFile()){
            System.out.println("\n"+"New order " +orderNumber+ " was successfully added to the file in root directory." + "\n");
        }else System.out.println("File order" + orderNumber+ " already exists in project root directory");

        FileWriter fileWriter = new FileWriter(order, true);

        BufferedWriter bw = new BufferedWriter(fileWriter);
        bw.write("Order # "+orderNumber);
        bw.write("\n"+ "Date: " + dateFormat.format(date));
        bw.write("\n"+"Address: " + address);
        String car = cars.orderCar(index);
        bw.write("\n"+ "Car: " + car);
        bw.write("\n"+"Distance(km): " +distance);
        bw.write("\n"+"Price($):" + price);
        bw.write("\n"+"Total to pay: " + "$" + getTotal(distance, price));

        bw.close();


    }

    public void getOrder(int orderNumber) throws FileNotFoundException {

        System.out.println(orderNumber + " Order details:");

        Scanner scanner = new Scanner(new FileReader("order"+orderNumber));
        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }

        scanner.close();
    }

}
