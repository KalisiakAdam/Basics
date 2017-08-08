package adt;

/**
 * Created by kalisiaczki on 20.06.2017.
 */
public class StackArray {

    private String[] string;
    private int n;

    public StackArray() {

        string = new String[1];
        n = 0;
    }

    public boolean isEmpty() {
        return n==0;
    }


    public void push (String s) {

        if (string.length == n) resize(string.length * 2);
        string[n++] = s;

    }

    public String pop() {
        if(n < (string.length/4)) resize(string.length/2);

        String stringPop = string[--n];


        return stringPop;
    }




    private void resize (int newCapacity) {

        String[] temp = new String[newCapacity];
        for (int i = 0; i < n; i++){
            temp[i] = string[i];
        }
        string = temp;


    }

    public static void main(String[] args) {

        StackArray stackQueue = new StackArray();
        stackQueue.push("Adam");
        stackQueue.push("Ula");
        stackQueue.push("Wiki");

        System.out.println(stackQueue.pop());
        System.out.println(stackQueue.pop());
        System.out.println(stackQueue.pop());

    }

}
