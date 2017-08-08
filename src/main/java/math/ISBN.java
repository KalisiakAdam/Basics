package math;

/**
 * Created by kalisiaczki on 10.06.2017.
 */
public class ISBN {
    public static void main(String[] args) {


        int n = 201314525;

        int sum = 0;
        for (int i = 1; i<= 10; i++) {

            int digit = n % 10 ;
            sum = sum + i * digit;
            System.out.println(sum);

            n = n / 10;

        }
        if (sum % 11 == 0) System.out.println("divided by 11");
    }
}
