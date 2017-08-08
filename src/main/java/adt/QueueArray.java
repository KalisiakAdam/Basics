package adt;

/**
 * Created by kalisiaczki on 20.06.2017.
 */
public class QueueArray {

    private int head;
    private int tail;
    private int n;
    private String[] strings;

    private QueueArray() {
        head = 0;
        tail = 0;
        n = 0;
        strings = new String[1];
    }

    public void enqueue (String s) {
        if(n == strings.length) resize(strings.length * 2);
        strings[tail++] = s;
        n++;

    }

//    public String dequeue() {
//        if(n < (strings.length/4)) resize(strings.length/2);
//
//
//    }


    private void resize (int capacity) {
       String[] temp = new String[capacity];
       for (int i = 0; i < n; i ++){
           temp[i] = strings[i];
       }
        strings = temp;

    }



}
