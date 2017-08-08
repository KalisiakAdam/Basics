package math;

/**
 * Created by kalisiaczki on 10.06.2017.
 */
public class DigitReverse {


    public static void main(String[] args) {


        int m = 483927424;

        String string = "";
        while (m!=0) {
            int digit = m % 10;
            string = string + digit;
            m = m/10;
            System.out.println("m is" + m);
        }
        System.out.println(string);
    }

}
