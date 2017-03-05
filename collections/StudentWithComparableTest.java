package collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by SG0221519 on 3/2/2017.
 */
public class StudentWithComparableTest {

    public final static void main(String[] args) {

        ArrayList<StudentWithComparable> al = new ArrayList<StudentWithComparable>();
        al.add(new StudentWithComparable(12, "Srujan"));
        al.add(new StudentWithComparable(9, "Ashok"));
        al.add(new StudentWithComparable(14, "Kranthi"));
        System.out.println("-----Before Sorting----");
        System.out.println(al.get(0).getAge() + " " + al.get(0).name);
        System.out.println(al.get(1).getAge() + " " + al.get(1).name);
        System.out.println(al.get(2).getAge() + " " + al.get(2).name);
        Collections.sort(al);
        System.out.println("----After Sorting-------");
        System.out.println(al.get(0).getAge() + " " + al.get(0).name);
        System.out.println(al.get(1).getAge() + " " + al.get(1).name);
        System.out.println(al.get(2).getAge() + " " + al.get(2).name);

    }
}
