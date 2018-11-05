public class Runner {


    public static void main(String[] args)
            throws NoCars,ValueIsEmpty,MaxValueException, MinValueException,
            NothingToSortException,NothingToSearch {

        Taxis myTaxis= new Taxis();
        myTaxis.addCars();
        myTaxis.getAllCars();
        myTaxis.sumValue();
        myTaxis.sortByFuel();
        myTaxis.searchCarsByValue();


    }

}


