package ds1;

/**
 * Created1 by SG0221519 on 2/16/2017.
 */
public class MergeSort1 {

    public void divideAndMerger(int[] a)
    {
            if(a.length ==1)
                return;
            int leftLen = a.length / 2;
            int rightLen = a.length - leftLen;
            int left[] = new int[leftLen];
            int right[] = new int[a.length - leftLen];
            for (int i = 0; i < leftLen; i++) {
                left[i] = a[i];
            }
            for (int j = leftLen; j < a.length; j++) {
                right[j] = a[j];
            }

            //display(left);
         //   display(right);
    }

   /* public void display(int[] a)
    {


        for(int i=0;<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }*/


    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        //MergeSort ms = new MergeSort();
        //ms.divideAndMerger(a);
    }

}
