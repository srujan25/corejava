package collections;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by SG0221519 on 7/7/2017.
 */
public class HashMapWithStudent {

    public static void main(String[] args) {

        HashSet<Student> hs = new HashSet<Student>();

        hs.add(new Student(1,"Srujan"));
        hs.add(new Student(1,"kumar"));
        hs.add(new Student(2,"A"));
        hs.add(new Student(2,"V"));
        hs.add(new Student(2,"Va"));

        System.out.println(hs);



    }

}
