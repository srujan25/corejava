package interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by SG0221519 on 3/1/2017.
 */
public class SecondHighestIntFromIntArray {

    public static void main(String[] args) {

        //1st method but long way
        /*TreeSet<Integer> hs = new TreeSet<>();
        Integer a[] = {10, 4, 51, 2};
        for (int ele : a) {
            hs.add(ele);
        }
        Object[] objects = hs.toArray();
        System.out.println(objects[objects.length-2]);*/

        //2nd way, short way
        Integer a[] = {10,2,3,4,45};
        Arrays.sort(a);
        System.out.println(a[a.length-2]);
    }
}
