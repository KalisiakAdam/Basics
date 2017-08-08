import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by kalisiaczki on 10.06.2017.
 */
public class QueueLinkedList  {
    private Node last;
    private Node first;
    private int numberOfElements;

    public QueueLinkedList() {
        last = null;
        first = null;
        numberOfElements = 0;
    }


    private class Node {
        private String name;
        private Node next;


    }
    public boolean isEmpty(){
        return first == null;
    }

    public int size() {
        return numberOfElements;
    }

    public String peek() {
        if (isEmpty()) throw new NoSuchElementException("No strings in queue");
        return first.name;
    }

    public void addItem(String name ) {
        Node oldLAst = last;
        last = new Node();
        last.name = name;
        last.next = null;
        if(isEmpty()) first = last;
        else oldLAst.next = last;
        numberOfElements++;

    }

    public String removeItem() {

        if(isEmpty()) throw new NoSuchElementException("no such Element");
        String string = first.name;
        first = first.next;
        numberOfElements--;
        if (isEmpty()) last = null;


        return string;
    }

    public Iterator<String> iterator() {
        return new QueueLinkedListIterator();
    }



    private class QueueLinkedListIterator implements Iterator<String>{
        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public String next() {
            if (!hasNext()) throw new NoSuchElementException("no things");
                String string = current.name;
                current = current.next;
            return string;
        }
    }





    public static void main(String[] args) {

        QueueLinkedList queueLinkedList = new QueueLinkedList();
        queueLinkedList.addItem("Adam");
        queueLinkedList.addItem("Badam");
        queueLinkedList.addItem("Cadam");
        queueLinkedList.addItem("Dadam");

      Iterator<String> toItaretate = queueLinkedList.iterator();
      while(toItaretate.hasNext()){
          String element = toItaretate.next();
          System.out.println(element);
      }

      queueLinkedList.removeItem();
        System.out.println("---------");

        Iterator<String> toItaretate2 = queueLinkedList.iterator();
        while(toItaretate2.hasNext()){
            String element = toItaretate2.next();
            System.out.println(element);
        }


    }




}
