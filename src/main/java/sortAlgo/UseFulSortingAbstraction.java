package sortAlgo;

/**
 * Created by kalisiaczki on 11.06.2017.
 */
public class UseFulSortingAbstraction {

    // is v less than w

    public static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) <0;
    }

    public static void exchange (Comparable [] a, int i, int j){

        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
}
