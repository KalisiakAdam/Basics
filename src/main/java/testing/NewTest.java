package testing;


import java.util.HashMap;
import java.util.Hashtable;

public class NewTest {

 private int number;
 private int age;
 private String name;

 public NewTest(int number, int age, String name){
     this.number = number;
     this.age = age;
     this.name = name;
 }

 public int getNumber(){
     return number;
 }

 public void setNumber(int number) {
     this.number = number;
 }


 public boolean equal(Object o){

     if (!(o instanceof NewTest )) return false;
     if (getClass() != o.getClass()) return false;

     if (o==null) return false;


     NewTest other = (NewTest) o;
     if(this.number!=other.number) return false;
     if(this.age!=other.age) return false;


     return this.name.equals(other.name);
 }

 public int hashCode(){
     int hash = 0;
     hash =  name.hashCode();



     return hash;
 }



    public static void main(String[] args) {

     NewTest newTest = new NewTest(1,28,"adam");
     NewTest newTest1 = new NewTest(5,28,"ula");
     NewTest newTest2 = new NewTest(1,28,"adam");

        System.out.println(newTest.hashCode());
        System.out.println(newTest1.hashCode());
        System.out.println(newTest2.hashCode());

        Hashtable hashtable = new Hashtable();
        hashtable.put("Adam","dwa");
        hashtable.put("Adam", newTest);

        System.out.println(hashtable.get("Adam"));
        System.out.println(hashtable.size());


    }
}
