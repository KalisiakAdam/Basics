package algorithms.fundamentals;

/**
 * Created by kalisiaczki on 15.06.2017.
 */
public class BinaryRepresToString {

    private static String toBinaryString(int n) {


        String s = "";
        for (int k = n; k > 0; k/=2){
            System.out.println("k/= " + (k/=2));
            s = (k % 2) + s;
        }


    return s;
  }

    public static void main(String[] args) {

        System.out.println(BinaryRepresToString.toBinaryString(10));
    }

}
