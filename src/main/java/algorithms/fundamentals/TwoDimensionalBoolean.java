package algorithms.fundamentals;

/**
 * Created by kalisiaczki on 15.06.2017.
 */
public class TwoDimensionalBoolean {

    public static char [][] fullfill(boolean [][] array) {

         char star = '*';
         char hash = '#';

         char newArray [][] = new char[array.length][array.length];
        System.out.println(newArray.length);

         for (int i = 0; i < newArray.length; i++){
             for(int j = 0; j < newArray.length; j++){
                 if (array[i][j] == true) {
                     newArray[i][j] = star;
                 }
                 else if(array[i][j] == false) {
                     newArray[i][j] = hash;
                 }
             }
         }

        return newArray;
    }

    public static void main(String[] args) {
        boolean [][] nowa = {{true,true,true,true, true}, {true,false,true, false}};



       char[][] nowaChar = TwoDimensionalBoolean.fullfill(nowa);

        for (int i = 0; i < nowaChar.length; i++){
            for(int j = 0; j < nowaChar.length; j++){
                System.out.println(nowaChar[i][j]);
            }
        }


    }

}
