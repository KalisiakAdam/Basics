package sortAlgo;

// complexity O(n2)

public class SelectSort {

    public static int[]  sort (int[] array){

        int n = array.length;
            for (int i = 0; i < n-1; i++){

                int min = i;

                for (int j = i + 1; j < n; j++) {
                    if (array[j] < array[min])
                        min = j;
                    System.out.println("min in second for: " + min);

                }


            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }


        return array;
    }



    public static void main(String[] args) {

        int[] a = {345, 1, 6432, 43, 6, 765, 24, 65, 8, 42};

        int[] b = SelectSort.sort(a);

        for (int i : b){
            System.out.println(i);
        }

    }


}
