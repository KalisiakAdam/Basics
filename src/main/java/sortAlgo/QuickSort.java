package sortAlgo;


public class QuickSort {

    public static int partition (int[] array, int lo, int hi) {

        int i = lo;
        int j = hi+1;

        while (true){
            while (array[++i]<array[lo])
                if (i==hi) break;

            while(array[lo]<array[--j])
                if (j==lo) break;

            if (i >= j) break;
            int temp = array[i];
            array[i] = array [j];
            array[j] = temp;

        }

        int temp2 = array[lo];
        array[lo] = array[j];
        array[j] = temp2;

        return j;
    }

    public static void sort (int[] array, int lo, int hi) {


    }


}
