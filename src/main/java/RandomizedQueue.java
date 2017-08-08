import java.util.Iterator;
import java.util.NoSuchElementException;
import edu.princeton.cs.algs4.StdRandom;


public class RandomizedQueue<Item> implements Iterable<Item> {
    private Item[] q;
    private int numberOfItem;

    public RandomizedQueue() {
        q = (Item[]) new Object[2];
        numberOfItem = 0;

    }

    public boolean isEmpty() {
        return numberOfItem == 0;
    }

    public int size() {
        return numberOfItem;
    }

    public void enqueue(Item item) {

        if (item.equals(null)) throw new NullPointerException("null");

        if (numberOfItem == q.length) resize(2 * q.length);
        q[numberOfItem++] = item;
    }

    public Item dequeue() {
        if (isEmpty()) throw new NoSuchElementException("RQ is empty");

        int myRadnomNumber = StdRandom.uniform(numberOfItem);
        Item item = q[myRadnomNumber];
        q[myRadnomNumber] = q[numberOfItem - 1];

        --numberOfItem;

        if (numberOfItem > 0 && numberOfItem == q.length / 4) resize(q.length / 2);
        return item;
    }

    public Item sample() {
        if (isEmpty()) throw new NoSuchElementException("RQ is empty");
        int myRadnomNumber = StdRandom.uniform(numberOfItem);
        return this.q[myRadnomNumber];
    }

    public Iterator<Item> iterator() {
        return new RQIterator();
    }

    public static void main(String[] args) {

    }

    private void resize(int capcity) {
        Item[] copy = (Item[]) new Object[capcity];
        for (int i = 0; i < numberOfItem; i++) {
            copy[i] = q[i];
        }
        q = copy;
    }

    private class RQIterator implements Iterator<Item> {
        private int i = numberOfItem;

        public boolean hasNext() {
            return i > 0;
        }
        public void remove() {
            throw new UnsupportedOperationException("unsupporte");
        }


        public Item next() {
            if (!hasNext()) throw new NoSuchElementException("no");
            return q[--i];

        }
    }
}
