public class Runner {


    public static void main(String[] args) {

        Taxis myTaxis= new Taxis();
        myTaxis.addCars();
        myTaxis.getAllCars();
        System.out.println(" ");

        myTaxis.sumValue();
        System.out.println(" ");

        myTaxis.sortByFuel();
        System.out.println(" ");

        myTaxis.searchCarsByValue();


    }

}


