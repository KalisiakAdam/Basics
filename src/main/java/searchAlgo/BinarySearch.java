package searchAlgo;


// O(log n) complexity


public class BinarySearch {

    public static int search (int[] array, int searchnumber) {

        int lo = 0;
        int hi = array.length-1;


        while(lo <= hi) {
            int mid = lo + (hi - lo)/2;

            if (searchnumber < array[mid]) {
                hi = mid - 1;
            }
            else if (searchnumber > array[mid]) {
                lo = mid + 1;
            }
            else return mid;
        }
        return -1;
    }


    public static void main(String[] args) {

         int[] a = {1, 3, 4, 56, 78, 98, 433, 567, 678};
         BinarySearch binarySearch = new BinarySearch();
        System.out.println(search(a, 678));


    }


}
