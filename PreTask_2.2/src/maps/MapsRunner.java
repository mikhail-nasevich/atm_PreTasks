package maps;

public class MapsRunner {


    public static void main(String[] args) {


        MapsBuilder map = new MapsBuilder();
        System.out.println("Speed of adding elements to maps:");
        map.buildHashMap();
        map.buildTreeMap();
        System.out.println("Speed of search element in maps:");
        map.searchHashMap();
        map.searchTreeMap();
        System.out.println("Speed of clearing maps:");
        map.deleteHashMap();
        map.deleteTreeMap();
    }
}
