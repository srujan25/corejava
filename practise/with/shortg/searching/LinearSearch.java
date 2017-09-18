package practise.with.shortg.searching;

public class LinearSearch {

    public static String linearSearch(int key, int[] array) {
        for (int index = 0; index < array.length; index++) {
            if (key == array[index])
                return "Key found";

        }
        return "Key didn't find in the given array";
    }

    public static void main(String[] args) {
        int[] inputArray = {6, 4, 8, 3, 2};
        System.out.println(linearSearch(10, inputArray));
    }
}

// Best Time complexity is O(1)
// Worst Time Complexity is O(n)