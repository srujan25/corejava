package practise.with.shortg.searching;

public class BSearch {

    public static String binarySearch(int[] inputArray, int key) {

        int start = 0;
        int end = inputArray.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == inputArray[mid]) {
                return "Key Found";
            }
            if (key < inputArray[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return "Didn't find";
    }


    public static String recursiveBinarySearch(int[] sortedArray, int start, int end, int key) {
        if (start <= end) {
            int mid = start + end / 2;
            if (key == sortedArray[mid]) {
                return "Found Key";
            }
            if (key < sortedArray[mid]) {
                return recursiveBinarySearch(sortedArray, start, mid - 1, key);
            } else if (key > sortedArray[mid]) {
                return recursiveBinarySearch(sortedArray, mid + 1, end, key);
            }
        }
        return "Didn't find";
    }

    public static void main(String[] args) {
        int[] inputArray = {4, 6, 8, 10};
        //System.out.println(binarySearch(inputArray, 4));
        System.out.println(recursiveBinarySearch(inputArray, 0, inputArray.length - 1, 43));
    }
}
// Best Time complexity is O(1)
// Worst Time Complexity is O(log n)