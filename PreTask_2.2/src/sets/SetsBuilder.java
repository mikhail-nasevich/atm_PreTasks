package sets;

import java.util.HashSet;
import java.util.TreeSet;

public class SetsBuilder {

    private final String pattern = "point %d";
    private int limit = 500000;

    HashSet<String> hash = new HashSet<>();
    TreeSet<String> tree = new TreeSet<>();

    public void buildHashSet() {
        final long start = System.nanoTime();
        for (int i = 0; i < limit; i++) {
            hash.add(String.format(pattern, i));
        }
        long hashSpeed = System.nanoTime() - start;
        System.out.println("Building HashSet: " + hashSpeed + " ns");
    }

    public void searchHashSet() {
        final long start = System.nanoTime();

            hash.equals("point 2018");

        long hashSpeed = System.nanoTime() - start;
        System.out.println("Searching in HashSet took: "+ hashSpeed + " ns");

    }

    public void deleteHashSet() {
        final long start = System.nanoTime();

        hash.clear();

        long hashSpeed = System.nanoTime() - start;
        System.out.println("Removing elements from HashSet took: " + hashSpeed + " ns");

    }



    public void buildTreeSet() {
        final long start = System.nanoTime();
        for (int i = 0; i < limit; i++) {
            tree.add(String.format(pattern, i));
        }
        long treeSpeed = System.nanoTime() - start;
        System.out.println("Building TreeSet: " + treeSpeed + " ns");
    }

    public void searchTreeSet() {
        final long start = System.nanoTime();

        tree.equals("point 2018");

        long treeSpeed = System.nanoTime() - start;
        System.out.println("Searching in TreeSet took: "+ treeSpeed + " ns");
    }


    public void deleteTreeSet() {
        final long start = System.nanoTime();

        tree.clear();

        long treeSpeed = System.nanoTime() - start;
        System.out.println("Removing elements from TreeSet took: " + treeSpeed + " ns");
    }



}
