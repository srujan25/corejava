package interview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by SG0221519 on 4/7/2017.
 */

// Note : in for each loop, we cannot remove a element from list. It throws Concurrent Modification Exception. But where as in Iterator it will not throw this exception
public class ConcurrentModExExample {

    public static void main(String[] args) {
        //forEachLoopWithList();
        //iteratorWithList();
        //forEachLoopWithCopyOnWriteArray();
    }

    //Not throws Concurrent Modification Exception
    private static void iteratorWithList() {
        ArrayList<Integer> al = arrayListData();
        Iterator it = al.iterator();
        while (it.hasNext()) {
            Integer var = (Integer) it.next();
            System.out.println(var);
            if (var.equals(1)) {
                it.remove();
            }
        }
    }

    //Throws Concurrent Modification Exception in foreach loop
    private static void forEachLoopWithList() {
        ArrayList<Integer> al = arrayListData();
        int index = 0;
        for (Integer each : al) {
            System.out.println(each);
            if (each.equals(2)) {
                al.remove(index);
            }
            index++;
        }
    }

    //not throws Concurrent modification in foreach loop also with CopyOnWriteArrayList class
    private static void forEachLoopWithCopyOnWriteArray()
    {
        CopyOnWriteArrayList<Integer> cowal = new CopyOnWriteArrayList();
        cowal.add(0);
        cowal.add(1);
        cowal.add(2);
        cowal.add(3);
        int index = 0;
        for(Integer each:cowal)
        {
            System.out.println(each);
            if(each.equals(1))
            {
                cowal.remove(index);
            }
            index++;
        }
    }

    private static ArrayList<Integer> arrayListData() {
        ArrayList<Integer> al = new ArrayList();
        al.add(0);
        al.add(1);
        al.add(2);
        return al;
    }
}
