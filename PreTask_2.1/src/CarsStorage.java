import cars.Auto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public abstract class CarsStorage {

    private ArrayList <Auto> allCars= new ArrayList<Auto>();



    public boolean addCar(Auto newCar) {
        return allCars.add(newCar);
    }


    public void getAllCars() {
        System.out.println("Available Cars:");

        for (Auto car : allCars) {
            System.out.println(car.getName()+"_"+car.getModel());

        }
    }


    public void sumValue() {
        int totalValue = 0;
        for (Auto car : allCars) {
            totalValue += car.getTotalValue();
        }
        System.out.println("Total Value of All Cars in Taxis: " + totalValue + "$");

    }

        public void sortByFuel() {
            Collections.sort(allCars, new Comparator());

            System.out.println("All Available Cars sorted by using Fuel:");

            for (Auto car : allCars) {

                System.out.println(car.getName() + "_" +car.getModel() +": " + car.getFuel());
            }
        }

        class Comparator implements java.util.Comparator<Auto> {
            @Override
            public int compare(Auto car1, Auto car2) {
                    return Double.valueOf(car1.getFuel()).compareTo(Double.valueOf(car2.getFuel()));
            }
        }

    public void searchCarsByValue() {
        Scanner upperValue = new Scanner(System.in);
        Scanner lowerValue = new Scanner(System.in);

        System.out.println("Please enter the upper Value for the Car");
        int maxValue = upperValue.nextInt();
        int max = 0;
        for (Auto car : allCars) {
            if (max < car.getValue()) {
                max=car.getValue();
            } else {


                System.out.println("Please enter the lower Value for the Car");
                int minValue = lowerValue.nextInt();


                if (maxValue >= car.getValue() && minValue <= car.getValue()) {
                    System.out.println(car.getName() + "_" + car.getModel() + ": " + car.getValue() + "$");
                }
            }


            upperValue.close();
            lowerValue.close();
        }
    }

}
