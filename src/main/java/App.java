import java.util.Iterator;

/**
 * Created by kalisiaczki on 26.05.2017.
 */
public class App {

    public static void main(String[] args) {
        Item adam = new Item(3,1);
        Item ula = new Item(5,2);
        Item wiki = new Item(1,3);
        Item lili = new Item(2,4);

        Item ja = new Item(5,3);


        RandomizedQueue randomizedQueue = new RandomizedQueue();


        System.out.println(ula + " ula");
       System.out.println(wiki + " wiki");
        System.out.println(lili + " lili");
        System.out.println(ja + " ja");


       randomizedQueue.enqueue(ula);
       randomizedQueue.enqueue(wiki);
        randomizedQueue.enqueue(lili);
        randomizedQueue.enqueue(ja);

        System.out.println(randomizedQueue.size());

        Iterator<Item> itr = randomizedQueue.iterator();

        while(itr.hasNext()){
            Item element = itr.next();
            System.out.println(element + " " );
        }

        randomizedQueue.dequeue();


        System.out.println(" after remove random ");


        Iterator<Item> itr2 = randomizedQueue.iterator();

        while(itr2.hasNext()){
            Item element = itr2.next();
            System.out.println(element + " ");
        }


        System.out.println(randomizedQueue.isEmpty());

    }
}
