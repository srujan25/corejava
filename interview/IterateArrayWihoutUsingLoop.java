package interview;

/**
 * Created by SG0221519 on 2/17/2017.
 */
public class IterateArrayWihoutUsingLoop {


    public void traverse(int a, int[] b) {
        if (a < b.length) {
            //System.out.println(a);
            System.out.println(b[a]);
            traverse(a + 1, b);
        }
    }

    public void reverseAnArray(int index, int[] array) {
        if (index >= 0) {
            System.out.println(array[index]);
            reverseAnArray(index - 1, array);
        }

    }

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4};
        IterateArrayWihoutUsingLoop ref = new IterateArrayWihoutUsingLoop();
        ref.traverse(0, array);
        ref.reverseAnArray(array.length - 1, array);
    }
}

