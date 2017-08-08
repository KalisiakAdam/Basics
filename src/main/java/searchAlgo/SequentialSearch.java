package searchAlgo;


// O(n) complexity

public class SequentialSearch {

    public boolean search (int[] a, int numberTosearch){

        for (int i : a){
           if(i == numberTosearch){
               return true;
           }

        }

        return false;
    }

    public static void main(String[] args) {


        int[] a = {1, 3, 4, 56, 78, 98, 433, 567, 678};
        SequentialSearch sequentialSearch = new SequentialSearch();
        System.out.println(sequentialSearch.search(a,456));

    }
}
