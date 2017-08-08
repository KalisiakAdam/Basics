package interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by kalisiaczki on 27.06.2017.
 */
public class ComparableComparator implements Comparable<ComparableComparator> {

    private final String firstName;
    private final String lastName;

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public ComparableComparator(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean equals (Object o) {

        if(!(o instanceof ComparableComparator )) return false;
        ComparableComparator other = (ComparableComparator) o;

        return this.firstName.equals(other.firstName) && this.firstName.equals(other.lastName);
    }

    public int hashCode () {
        return 31 * firstName.hashCode() + lastName.hashCode();
    }




    @Override
    public int compareTo(ComparableComparator o) {
        int next = lastName.compareTo(o.lastName);
        return ( (next != 0 ? next : firstName.compareTo(o.firstName) ));
    }

    public static void main(String[] args) {

        ComparableComparator ja = new ComparableComparator("adam", "kalisiak");
        ComparableComparator ty = new ComparableComparator("ula", "kalisiak");
        ComparableComparator one = new ComparableComparator("wiki", "kalisiak");

        List<ComparableComparator> list = new ArrayList<>();
        list.add(ja);
        list.add(ty);
        list.add(one);

        Collections.sort(list);

        for( ComparableComparator c : list){
            System.out.println(c.getFirstName());
        }

        System.out.println(ja.compareTo(ty));
    }


}