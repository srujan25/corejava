package searcing.algo;

import java.util.Arrays;

public class BinrarySearchPractise {

    public void recurBinarySearch(int array[], int element,int actualLength) {
        int mid = array.length / 2;
        if (array[mid] == element) {
            System.out.printf("Found element");
            return;
        } else if (element < array[mid]) {
            int start = 0;
            int end = mid;
            recurBinarySearch(Arrays.copyOfRange(array, start, end), element,actualLength);
        } else if (element > array[mid]) {
            int start = mid + 1;
            int end = array.length;
            if(end > actualLength) {
                System.out.println("didn't find");
                return;
            }
            recurBinarySearch(Arrays.copyOfRange(array, start, end), element,actualLength);
        }else{
            System.out.println("didn't find");
        }
    }

    public static void main(String[] args) {

        BinrarySearchPractise bsp = new BinrarySearchPractise();
        int array[] = {1,2,3,4,5,6,7,8};
        bsp.recurBinarySearch(array,9,array.length);
    }
}
