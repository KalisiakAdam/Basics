import java.util.Iterator;
import java.util.NoSuchElementException;


public class Deque<Item> implements Iterable<Item> {
    private Item[] s;
    private int numberOfItems;

    public Deque() {
        numberOfItems = 0;
        s = (Item[]) new Object[2];

    }

    public boolean isEmpty() {
        return numberOfItems == 0;
    }

    public int size() {
        return numberOfItems;
    }


    public void addFirst(Item item) {
        if (item.equals(null)) throw new NoSuchElementException("Null item cannot be added");
        if (numberOfItems == s.length) resize(2*s.length);

        Item [] oldaS = (Item[]) new Object [s.length];
        oldaS[0] = item;
        for (int i = 0; i < numberOfItems; i++) {
            oldaS[i + 1] = s[i];
        }
        s = oldaS;
        numberOfItems++;
    }
    public void addLast(Item item) {
        if (numberOfItems == s.length) resize(2*s.length);
        s[numberOfItems++] = item;

    }
    public Item removeFirst() {
       if (isEmpty()) throw new NoSuchElementException("empty");

       Item item = this.s[0];
        for (int i = 0; i < numberOfItems - 1; i++) {
            s[i] = s[i + 1];
        }
        numberOfItems--;
        if (numberOfItems > 0 && numberOfItems == s.length/4) resize(s.length/2);
        return item;
    }
    public Item removeLast() {
        if (isEmpty()) throw new NoSuchElementException("No Element");
        Item item = s[--numberOfItems];
        s[numberOfItems] = null;
        if (numberOfItems > 0 && numberOfItems == s.length/4) resize(s.length/2);
        return item;
    }

    private void resize(int capcity) {
        Item[] copy = (Item[]) new Object [capcity];
        for (int i = 0; i < numberOfItems; i++) {
            copy[i] = s[i];
        }
        s = copy;
    }

    public Iterator<Item> iterator() {
        return new DequeIterator();
    }

    private class DequeIterator implements Iterator<Item> {
        private int i = numberOfItems;

        public boolean hasNext() {
            return i > 0 ;
        }

        public void remove() {
            throw new UnsupportedOperationException("unsupporte");
        }

        public Item next() {
            if (!hasNext()) throw new NoSuchElementException("no");
            return s[--i];

        }
    }


}
