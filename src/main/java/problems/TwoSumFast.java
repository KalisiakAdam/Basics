package problems;

import searchAlgo.BinarySearch;
import sortAlgo.QuickSort;

import java.util.Arrays;

/**
 * Created by kalisiaczki on 22.06.2017.
 */
public class TwoSumFast {

    public static int count(int[] a) {
        Arrays.sort(a);

        int n = a.length;
        int count = 0;

        for(int i = 0; i < n; i ++) {
            if (BinarySearch.search(a, -a[i]) > i)
            count++;
        }


        return count;
    }



    public static void main(String[] args) {

        int[] a  = {2,4,76,34,98,5,23,45,61,9,3,-3,-2,-4};
        Arrays.sort(a);
        for(int i : a){
            System.out.print(i +", ");
        }
        System.out.println(" ");
        System.out.println(count(a));


    }


}
