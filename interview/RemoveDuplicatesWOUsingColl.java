package interview;

/**
 * Created by SG0221519 on 3/11/2017.
 */
public class RemoveDuplicatesWOUsingColl {


    public void removeDuplicates(Integer[] source) {
        int destCount = 0;
        Integer dest[] = new Integer[source.length];
        for (int i = 0; i < source.length; i++) {
            boolean present = false;

            for (int j = 0; j < dest.length; j++) {
                if (dest[j] == source[i]) {
                    present = true;
                }

            }
            if (i == 0)
                dest[i] = source[i];
            if (!present && i != 0) {
                destCount++;
                dest[destCount] = source[i];
            }
        }
        traverse(dest);
    }

    public void traverse(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null)
                System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        Integer array[] = {5, 2, 5, 5, 6, 1, 4, 2, 5};
        RemoveDuplicatesWOUsingColl rdu = new RemoveDuplicatesWOUsingColl();
        rdu.removeDuplicates(array);
    }
}
