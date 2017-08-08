/**
 * Created by kalisiaczki on 10.06.2017.
 */
public class StackLinkedList {
    private Node top;
    private int numberOfItem;

    private class Node {
        private String name;
        private Node next;

    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return numberOfItem;
    }



}
