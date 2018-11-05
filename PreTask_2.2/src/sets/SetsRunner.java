package sets;

public class SetsRunner {

    public static void main(String[] args) {


        SetsBuilder set = new SetsBuilder();
        System.out.println("Speed of adding elements to sets:");
        set.buildHashSet();
        set.buildTreeSet();
        System.out.println("Speed of search element in sets:");
        set.searchHashSet();
        set.searchTreeSet();
        System.out.println("Speed of clearing sets:");
        set.deleteHashSet();
        set.deleteTreeSet();
    }
}
