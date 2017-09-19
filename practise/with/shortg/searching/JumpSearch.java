package practise.with.shortg.searching;

public class JumpSearch {
    public static String jumpSearch(int[] inputArray, int jump, int key) {
        int jumpCount = jump;
        for (int i = 0; i <= inputArray.length; i++) {
            if (key == inputArray[0]) {
                return "Key Found";
            }
            if (jumpCount < inputArray.length && key == inputArray[jumpCount]) {
                return "Key Found";
            } else if ((jumpCount >= inputArray.length && key < inputArray[inputArray.length - 1]) || (jumpCount < inputArray.length && key < inputArray[jumpCount])) {
                int linearArray[] = new int[inputArray.length - ((jumpCount) / 2 + 1)];
                for (int j = ((jumpCount) / 2 + 1), k = 0; j < inputArray.length; j++, k++) {
                    linearArray[k] = inputArray[j];
                }
                return LinearSearch.linearSearch(key, linearArray);
            } else {
                jumpCount = jumpCount * 2;
            }
        }

        return "Key didn't find";
    }

    public static void main(String[] args) {
        int[] inputArray = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 114, 233, 377, 610};
        System.out.println(jumpSearch(inputArray, 4, 0));
    }
}
// Best Time complexity is O(1)
// Worst Time Complexity is O(√n)

