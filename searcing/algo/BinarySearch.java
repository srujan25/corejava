package searcing.algo;

/**
 * Created by SG0221519 on 3/17/2017.
 */
public class BinarySearch {

    public void binarySearch(Integer[] array, Integer element) {
        int start = 0;
        int end = array.length - 1;
        int totalLoops = 0;
        while (start <= end) {
            int mid = start + end / 2;
            if (array[mid] == element) {
                System.out.println("found at index" + mid);
                System.out.println("Total Loops--->" + totalLoops);
                break;
            }
            if (array[mid] < element)
                start++;
            if (array[mid] > element)
                end--;
            totalLoops++;
        }
    }

    public int recursive(int start, int end, Integer[] array, int element) {
        if (start < end) {
            int mid = start + end / 2;

            if (array[mid] == element)
                return mid;
            if (array[mid] < element) {
                return recursive(mid, end, array, element);
            }
            if (array[mid] > element) {
                return recursive(start, mid, array, element);
            }

        }
        return -(start + 1);
    }



    public static void main(String[] args) {
        Integer array[] = {1, 2, 3, 4, 5, 6, 7, 8};
        BinarySearch bs = new BinarySearch();
        bs.binarySearch(array, 4);
       // bs.recursive(0, array.length - 1, array, 8);
    }
}
