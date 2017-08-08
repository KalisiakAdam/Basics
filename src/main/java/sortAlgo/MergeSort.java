package sortAlgo;

import edu.princeton.cs.algs4.Merge;


// complexity O(n log n )
public class MergeSort {

    private static void marge(int[] first, int[] last, int lo, int mid, int hi){

        // merge
        int i = lo;
        int j = mid ;

        for (int k = lo; k < hi; k++){

            if       (i == mid)            last[k] = first[j++];
            else if  (j == hi)             last[k] = first[i++];
            else if  (first[j]<first[i])   last[k] = first[j++];
            else                           last[k] = first[i++];
        }
        // copy
        for (int k = lo; k < hi; k++){
            first[k] = last[k];
        }

    }

    private static void sort(int[] first, int[] last, int lo, int hi) {

        if (hi - lo <= 1) return;

        int mid = lo + (hi - lo)/2;

        sort(first, last, lo, mid);
        sort(first,last,mid,hi);

        marge(first, last, lo, mid, hi);

    }

    public static void sort (int[] array){
        int[] last = new int[array.length];
        sort(array,last,0,array.length);

    }

    public static boolean isSorted (int[] array) {
        for(int i = 1; i < array.length; i++){
            return array[i - 1] < array[i];
        }
        return false;
    }

    public static void show (int[] array) {
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }



    public static void main(String[] args) {

        int[] a = {345, 1, 6432, 43, 6, 765, 24, 65, 8, 42};
        MergeSort.sort(a);
        System.out.println(MergeSort.isSorted(a));
        MergeSort.show(a);





        }


    }

