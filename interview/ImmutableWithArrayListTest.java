package interview;


import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by SG0221519 on 4/7/2017.
 */
class ImmutableWithArrayList {
    //private final MyArrayList myArrayList;
    public ImmutableWithArrayList(MyArrayList myArrayList) {
        //this.myArrayList = new MyArrayList();
        //this.myArrayList = myArrayList;
        Iterator it = myArrayList.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }

    /*public MyArrayList getMyArrayList() {
        return myArrayList;
    }*/
}

class MyArrayList extends ArrayList {
    private MyArrayList al;

    public MyArrayList()
    {

    }
    public MyArrayList(ArrayList al)
    {
        //this.al = (MyArrayList) al;
        this.al = new MyArrayList();
        Iterator it = al.iterator();
        while(it.hasNext())
        {
            this.al.myAdd(it.next());
        }
    }

    private void myAdd(Object o)
    {
        super.add(o);
    }
    @Override
    public boolean add(Object o) {
        try {
            throw new UnModifiableException();
        } catch (UnModifiableException e) {
            e.printStackTrace();
        }
        return false;
    }
}

class UnModifiableException extends Exception {
    public UnModifiableException() {
        super("Cannot change the Object");
    }
}

public class ImmutableWithArrayListTest
{
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(1);
        al.add(2);
        MyArrayList mal = new MyArrayList(al);
        ImmutableWithArrayList iwal = new ImmutableWithArrayList(mal);
        System.out.println(iwal);
    }
}

