package practise.with.shortg.searching;

import java.util.Arrays;

public class ExponentialSearch {

    public static String expoSearch(int[] inputArray, int key) {
        int incr = 1;
        for (int i = 0; i <= inputArray.length; i++) {
            if (key == inputArray[0]) {
                return "Key Found";
            }
            if (incr < inputArray.length && key == inputArray[incr]) {
                return "Key Found";
            } else if ((incr >= inputArray.length && key < inputArray[inputArray.length - 1]) || (incr < inputArray.length && key < inputArray[incr])) {
                int bsArray[] = new int[inputArray.length - ((incr) / 2 + 1)];
                for (int j = ((incr) / 2 + 1), k = 0; j < inputArray.length; j++, k++) {
                    bsArray[k] = inputArray[j];
                }
                return BSearch.binarySearch(bsArray, key);
            } else {
                incr = incr * 2;
            }
        }

        return "Key didn't find";
    }

    public static void main(String[] args) {
        int[] inputArray = {4, 6, 8, 10};
        System.out.println(expoSearch(inputArray, 6));
    }
}
// Best Time complexity is O(1)
// Worst Time Complexity is O(log n)