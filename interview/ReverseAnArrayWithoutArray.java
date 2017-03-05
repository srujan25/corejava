package interview;

/**
 * Created by SG0221519 on 2/17/2017.
 */
public class ReverseAnArrayWithoutArray {


    public void display(int[] a)
    {
        int  j= a.length-1;
        for(int i=0;i<a.length/2;i++,j--) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }

    public void display1(int[] a)
    {

        System.out.println("--------------------");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("--------------------");
    }

    public static void main(String[] args) {

        int a[] = {1,2,3,4,5};
        ReverseAnArrayWithoutArray r = new ReverseAnArrayWithoutArray();
        r.display(a);
        r.display1(a);

    }
}
