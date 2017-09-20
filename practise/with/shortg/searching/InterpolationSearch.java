package practise.with.shortg.searching;

public class InterpolationSearch {

    public static String interpolationSearch(int[] inputArray, int key) {
        int start = 0;
        int end = inputArray.length - 1;
        while (start <= end && key >= inputArray[start] && key <= inputArray[end]) {
            int pos = start + ((key - inputArray[start]) * (end - start) / (inputArray[end] - inputArray[start]));
            if (key == inputArray[pos]) {
                return "Key Found";
            }
            if (key < inputArray[pos]) {
                end = pos - 1;
            } else {
                start = pos + 1;
            }
        }
        return "key didn'   t find";
    }

    public static void main(String[] args) {
        int[] inputArray = {4, 6, 8, 10};
        System.out.println(interpolationSearch(inputArray, 10));
    }
}

// Best Time complexity is O(1)
// Worst Time Complexity is O(log log n)