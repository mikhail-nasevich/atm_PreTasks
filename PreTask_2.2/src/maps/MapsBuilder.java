package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsBuilder {

    private final String pattern = "point %n%d";
    private int limit = 500000;
    Map<String, Integer> hashMap = new HashMap<>();
    Map<String, Integer> treeMap = new TreeMap<>();

    public void buildHashMap() {
        final long start = System.nanoTime();
        for (int i = 0; i < limit; i++) {
            hashMap.put((String.format(pattern, i)), i);
        }
        long speed = System.nanoTime() - start;
        System.out.println("Adding to HashMap: " + speed + " ns");

    }

    public void searchHashMap() {
        final long start = System.nanoTime();
        hashMap.equals(6666);
        long speed = System.nanoTime() - start;
        System.out.println("Searching in HashMap took: " + speed + " ns");
    }


    public void deleteHashMap() {
        final long start = System.nanoTime();
        hashMap.clear();
        long speed = System.nanoTime() - start;
        System.out.println("Clearing HashMap took: " + speed + " ns");

    }

    public void buildTreeMap() {
        final long start = System.nanoTime();

        for (int i = 0; i < limit; i++) {
            treeMap.put((String.format(pattern, i)), i);
        }
        long speed = System.nanoTime() - start;
        System.out.println("Adding to TreeMap: " + speed + " ns");

    }

    public void searchTreeMap() {
        final long start = System.nanoTime();
        treeMap.equals(6666);
        long speed = System.nanoTime() - start;
        System.out.println("Searching in TreeMap took " + speed + " ms");
    }


    public void deleteTreeMap() {
        final long start = System.nanoTime();
        treeMap.clear();
        long speed = System.nanoTime() - start;
        System.out.println("Clearing TreeMap took: " + speed + " ns");

    }

}
