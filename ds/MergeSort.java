package ds;

/**
 * Created by SG0221519 on 2/16/2017.
 */
public class MergeSort {

    public void divideAndMerger(int[] a) {
        if (a.length == 1)
            return;
        int leftLen = a.length / 2;
        // int rightLen = a.length - leftLen;
        int left[] = new int[leftLen];
        int right[] = new int[a.length - leftLen];
        for (int i = 0; i < leftLen; i++) {
            left[i] = a[i];
        }
        for (int j = leftLen; j < a.length; j++) {
            right[j - leftLen] = a[j];
        }
        divideAndMerger(left);
        divideAndMerger(right);
        sort(left, right);
        // display(left);
        //  display(right);
    }

    public void display(int[] a) {

        System.out.println("--------------------");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("--------------------");
    }


    public static void main(String[] args) {
        int a[] = {4, 1, 3, 2};
        MergeSort ms = new MergeSort();
        ms.divideAndMerger(a);
        ms.display(a);
    }

    public void sort(int[] a, int[] b) {
        int first = 0;
        int second = 0;

        while (first < a.length && second < b.length) {

            if (a[first] > b[second]) {
                int temp = a[first];
                a[first] = b[second];
                b[second] = temp;
                first++;
            } else {
                second++;
            }
        }

    }

}
