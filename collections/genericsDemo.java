package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by SG0221519 on 2/17/2017.
 */
public class genericsDemo {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add(1);
        al.add("Srujan");

        Iterator it =al.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
