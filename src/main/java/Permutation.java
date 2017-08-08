import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class Permutation {


    public static void main(String[] args) {

        int k = Integer.parseInt(args[0]);
        RandomizedQueue<String> randomizedQueue = new RandomizedQueue<>();
        String[] strings = StdIn.readAllStrings();
        StdRandom.shuffle(strings);

        for (int i = 0; i < k; i++) {
            randomizedQueue.enqueue(strings[i]);
        }

        for (int i = 0; i < k; i++) {
            System.out.println(randomizedQueue.dequeue());

        }


    }
}
