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
                start = mid + 1;
            if (array[mid] > element)
                end = mid - 1;
            totalLoops++;
        }
    }

    public int recursive(int start, int end, Integer[] array, int element) {
        if (end >= start) {
            int mid = start + (end - start / 2);
            if (array[mid] == element) {
                return mid;
            }
            if (element > array[mid]) {
                return recursive(mid + 1, end, array, element);
            } else {
                return recursive(start, mid - 1, array, element);
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        Integer array[] = {1, 2, 3, 4, 5, 6, 7, 8};
        BinarySearch bs = new BinarySearch();
        bs.binarySearch(array, 5);
        int result = bs.recursive(0, array.length - 1, array, 3);
        System.out.println(result);
        /*if(result!=-1)
        {
            System.out.println("Found at location "+result);
        }else
        {
            System.out.println("Not Found");
        }*/
    }
}
