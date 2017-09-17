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

    public static void main(String[] args) {
        int[] inputArray = {4, 6, 8, 10};
        System.out.println(binarySearch(inputArray, 4));
    }
}
// Best Time complexity is O(1)
// Worst Time Complexity is O(log n)