package sortAlgo;


// complexity O(n2)

public class InsertSort {

    public static int[] sort (int[] array) {

        int n = array.length;

        for(int i = 0; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if(array[j] < array[j-1]){
                    int temp = array[j-1];
                    array[j-1] = array [j];
                    array[j] = temp;
                }

            }
        }

        return array;
    }

    public static void main(String[] args) {


        int[] a = {345, 1, 6432, 43, 6, 765, 24, 65, 8, 42};
        int[] b = InsertSort.sort(a);

        for (int i : b) {
            System.out.println(i);
        }
    }
}
