package practise.with.shortg.hers;

import java.io.BufferedReader;
import java.io.InputStreamReader;


class TestClass {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalCases = Integer.parseInt(br.readLine());
        int size = 0;
        int searchKey = -200;

        for (int i = 0; i < totalCases; i++) {

            // 1st line to get array size
            size = Integer.parseInt(br.readLine());

            // 2nd line to get array elements
            String[] input = br.readLine().split(" ");
            System.out.println(input.length);
            int[] inputArray= new int[size];
            for (int j = 0; j < size; j++) {
                inputArray[j] = Integer.parseInt(input[j]);
            }

            // 3rd to get the element to be searched
            searchKey = Integer.parseInt(br.readLine());

            if (linearSearch(searchKey, inputArray)) {
                System.out.println("Found " + searchKey);
            }

            else {
                System.out.println(searchKey + " not found!");
            }

        } //for
    } // main()

    public static boolean linearSearch(int key, int[] A) {
        for (int element : A) {
            if (element == key) {
                return true;
            }
        }
        return false;
    }
}
