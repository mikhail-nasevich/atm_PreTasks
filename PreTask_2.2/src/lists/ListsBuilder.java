package lists;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListsBuilder {

    private final String pattern = "point %d";
    private int limit = 500000;

    private ArrayList<String> array = new ArrayList<>();
    private LinkedList<String> linked = new LinkedList<>();


// ArrayList Methods

    public void buildArrayList() {
        final long start = System.nanoTime();
        for (int i = 0; i < limit; i++) {
            array.add(String.format(pattern, i));
        }
        long arraySpeed = System.nanoTime() - start;
        System.out.println("Building ArrayList: " + arraySpeed + " ns");
    }

    public void searchArrayList() {
        final long start = System.nanoTime();
        for (int i =0; i<=array.size() - 1;  i++) {
            array.indexOf("point 2018");
        }
        long arraySpeed = System.nanoTime() - start;
        System.out.println("Searching in ArrayList took: "+ arraySpeed + " ns");

    }

    public void deleteArrayList() {
        final long start = System.nanoTime();

            array.clear();

        long arraySpeed = System.nanoTime() - start;
        System.out.println("Removing elements from ArrayList took: " + arraySpeed + " ns");

    }


// LinkedList Methods


    public void buildLinkedList() {
        final long start = System.nanoTime();
        for (int i = 0; i < limit; i++) {
            linked.add(String.format(pattern, i));
        }
        long linkedSpeed = System.nanoTime() - start;
        System.out.println("Building LinkedList: " + linkedSpeed + " ns");
    }


    public void searchLinkedList() {
        final long start = System.nanoTime();
        for (int i = linked.size() - 1; i >= 0; i--) {
            linked.indexOf("point 2018");
        }
        long linkedSpeed = System.nanoTime() - start;
        System.out.println("Searching in LinkedList took: "+ linkedSpeed + " ns");
    }


    public void deleteLinkedList() {
        final long start = System.nanoTime();

            linked.clear();

        long linkedSpeed = System.nanoTime() - start;
        System.out.println("Removing elements from LinkedList took: " + linkedSpeed + " ns");
    }


}
