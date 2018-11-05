package lists;


public class ListsRunner {

    public static void main(String[] args) {
        ListsBuilder speed = new ListsBuilder();
        System.out.println("Speed of adding elements to lists:");
        speed.buildArrayList();
        speed.buildLinkedList();
        System.out.println("Speed of search element in lists:");
        speed.searchArrayList();
        speed.searchLinkedList();
        System.out.println("Speed of clearing lists:");
        speed.deleteArrayList();
        speed.deleteLinkedList();
    }
}
