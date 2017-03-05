package ds1;

/**
 * Created by SG0221519 on 2/11/2017.
 */
public class BubbleSortDemo {

    public void bubbleSort(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {

            for(int j=0;j<a.length-1;j++)
            {
                if(a[j] > a[j+1])
                {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }


    public void display(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        BubbleSortDemo bs = new BubbleSortDemo();
        int a[] = {10,2,4,7,7,3,9};
        bs.bubbleSort(a);
        bs.display(a);
    }

}
