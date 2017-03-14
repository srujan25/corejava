package interview;

/**
 * Created by SG0221519 on 3/14/2017.
 */
public class SumOfArrayInArray {

    public void checkSumofElementGivenArray(Integer[] array, int number) {
        boolean flag = false;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int sum = array[i] + array[j];
                if (sum == number) {
                    flag = true;
                    break;
                }
            }
            if (flag)
                break;
        }
        System.out.println(flag);
    }

    public static void main(String[] args) {
        Integer array[] = {1, 4, 45, 6, 10, -8};
        SumOfArrayInArray sumOfArrayInArray = new SumOfArrayInArray();
        sumOfArrayInArray.checkSumofElementGivenArray(array, 17);

    }
}
