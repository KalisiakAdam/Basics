package adt;


public class StackLinkedList {

    private Node first;
    private int n;

    private StackLinkedList() {
        first = new Node();
        n = 0;
    }

    private class Node {
        String string;
        Node next;

    }

    public void push (String s) {

        if (first == null) {
            first.string = s;
            first.next = null;
            n++;
        }else{
            Node lastFirst = first;
            first = new Node();
            first.string = s;
            first.next = lastFirst;
            n++;
        }

    }
    public String pop() {
        String string = first.string;
        first = first.next;
        n--;
        return string;
    }
    public boolean isEmpty() {
        return n==0;
    }

    public int size() {
        return n;
    }


    public static void main(String[] args) {

        StackLinkedList stackLinkedList = new StackLinkedList();

        stackLinkedList.push("adam");
        stackLinkedList.push("ula");
        stackLinkedList.push("lili");

        System.out.println(stackLinkedList.pop());
        System.out.println(stackLinkedList.pop());
        System.out.println(stackLinkedList.size());

    }



}
