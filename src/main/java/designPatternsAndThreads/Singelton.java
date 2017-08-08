package designPatternsAndThreads;

/**
 * Created by kalisiaczki on 11.06.2017.
 */
public class Singelton {

    private Singelton singelton;

    private Singelton() {



    }

    public Singelton getSingelton(){
        if(singelton==null){
            synchronized (Singelton.class){
                if (singelton==null){
                    singelton = new Singelton();


                }
            }
        }

        return singelton;
    }


    public static void main(String[] args) {
        Singelton singelton = new Singelton();
        Singelton singelton1 = new Singelton();


        System.out.println(singelton);
        System.out.println(singelton1);
    }
}
