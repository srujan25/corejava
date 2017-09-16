package practise.with.shortG.Searching;

public class LinearSearch {

    public String linearSearch(int key, int[] array) {
        for (int index = 0; index < array.length; index++) {
            if (key == array[index])
                return "Key found at index " + index;

        }
        return "Key didn't find in the given array";
    }

    public static void main(String[] args) {
        LinearSearch searchObj = new LinearSearch();
        int[] inputArray = {6, 4, 8, 3, 2};
        System.out.println(searchObj.linearSearch(10, inputArray));
    }
}

// Best Time complexity is O(1)
// Worst Time Complexity is O(n)