package searcing.algo;

/**
 * Created by SG0221519 on 3/17/2017.
 */
public class LinearSearch {

    public void linearSearch(Integer[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                System.out.println("Found index of " + element + " at " + i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Integer[] array = {1,2,3,4};
        LinearSearch ls = new LinearSearch();
        ls.linearSearch(array,3);
    }
}
