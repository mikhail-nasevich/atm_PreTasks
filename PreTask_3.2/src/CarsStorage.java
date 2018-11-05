import cars.Auto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;


public abstract class CarsStorage {

    private ArrayList<Auto> allCars = new ArrayList<>();


    public boolean addCar(Auto newCar) {
        return allCars.add(newCar);
    }


    public void getAllCars() throws NoCars {
        if (allCars.isEmpty()) {
            throw new NoCars(
                    "There are no cars to display. Please, add any car to the list");
        } else
            System.out.println("Available Cars:");

        for (Auto car : allCars) {
            System.out.println(car.getName() + "_" + car.getModel());

        }
    }


    public String orderCar(int index) throws NoCars {
        Auto orderedCar;
        if (allCars.isEmpty()) {
            throw new NoCars(
                    "There are no cars to display. Please, add any car to the list");
        } else
            orderedCar = allCars.get(index-1);
            return orderedCar.getName() + "_" + orderedCar.getModel();


    }




    public void sumValue() throws ValueIsEmpty {
        if (!(allCars.isEmpty())) {
            int totalValue = 0;
            for (Auto car : allCars) {
                totalValue += car.getTotalValue();
            }
            System.out.println("Total Value of All Cars in Taxis: " + totalValue + "$");
        } else {
            throw new ValueIsEmpty(
                    "Value can not be calculated, Cars is absent");

        }

    }

    public void sortByFuel() throws NothingToSortException {
        try {
            if (!(allCars.isEmpty())) {
        Collections.sort(allCars, new Comparator());

        System.out.println("All Available Cars sorted by using Fuel:");
        for (Auto car : allCars) {
            System.out.println(car.getName() + "_" + car.getModel() + ": " + car.getFuel());
        }
            } else {
                throw new NothingToSortException("Nothing to sort in the list. Please add cars and try again.");
            }
        } catch (ClassCastException e) {
            System.out.println("Comparator was unable to cast the object to a subclass.");
        }


    }

    class Comparator implements java.util.Comparator<Auto> {
        @Override
        public int compare(Auto car1, Auto car2) {
            return Double.valueOf(car1.getFuel()).compareTo(Double.valueOf(car2.getFuel()));
        }
    }

    public void searchCarsByValue() throws MaxValueException, MinValueException, NothingToSearch {

        try {
            if (!(allCars.isEmpty())) {
                Scanner upperValue = new Scanner(System.in);
                Scanner lowerValue = new Scanner(System.in);

                System.out.println("Please enter the upper Value for the Car");
                int maxValue = upperValue.nextInt();
                int max = 0;
                for (Auto car : allCars) {
                    if (max < car.getValue()) {
                        max = car.getValue();
                    }
                }

                if (maxValue > max && maxValue < 0) {
                    throw new MaxValueException("Please, recheck maxValue.");
                }

                System.out.println("Please enter the lower Value for the Car");
                int minValue = lowerValue.nextInt();

                if (minValue > maxValue && minValue < 0) {
                    throw new MinValueException(
                            "The min value for car can not be higher than the max");
                }

                for (Auto car : allCars) {
                    if (maxValue >= car.getValue() && minValue <= car.getValue()) {
                        System.out.println(car.getName() + "_" + car.getModel() + ": " + car.getValue() + "$");
                    }
                 }

            } else {
                throw new NothingToSearch(
                        "Nothing can be found in the empty list. Please add cars before.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Incorrect Value format. Please, recheck entered values.");
        } catch (IllegalStateException e) {
            System.out.println("The SEARCH can not not be RUN at the moment. Please, try again later");
        }

    }
}

class NoCars extends Exception {

    String errorMessage;

    public NoCars(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getMessage() {
        return errorMessage;
    }


}

    class ValueIsEmpty extends Exception {

        String errorMessage;

        public ValueIsEmpty(String errorMessage) {
            this.errorMessage = errorMessage;
        }

        public String getMessage() {
            return errorMessage;
        }

    }


    class NothingToSortException extends Exception {

        String errorMessage;

        public NothingToSortException(String errorMessage) {
            this.errorMessage = errorMessage;
        }

        public String getMessage() {
            return errorMessage;
        }
    }

    class MaxValueException extends Exception {

        String errorMessage;

        public MaxValueException(String errorMessage) {
            this.errorMessage = errorMessage;
        }

        public String getMessage() {
            return errorMessage;
        }

    }

    class MinValueException extends Exception {

        String errorMessage;

        public MinValueException(String errorMessage) {
            this.errorMessage = errorMessage;
        }

        public String getMessage() {
            return errorMessage;
        }

    }

    class NothingToSearch extends Exception {

        String errorMessage;

        public NothingToSearch(String errorMessage) {
            this.errorMessage = errorMessage;
        }

        public String getMessage() {
            return errorMessage;
        }
    }