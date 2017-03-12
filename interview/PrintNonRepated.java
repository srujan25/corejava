package interview;

/**
 * Created by SG0221519 on 3/12/2017.
 */
public class PrintNonRepated {


    public void printNonRepated(Integer[] array) {
        Integer[] nonRepeated = new Integer[array.length];
        Integer[] repeated = new Integer[array.length];
        int repeatedCount = 0;
        int nonRepeatedCount = 0;
        for (int i = 0; i < array.length; i++) {
            boolean repeatedFound = false;
            for (int k = 0; k < repeated.length; k++) {
                if (array[i] == repeated[k]) {
                    repeatedFound = true;
                    break;
                }
            }
            if(!repeatedFound) {
                boolean present = false;
                int foundIndex = 0;
                for (int j = 0; j < nonRepeated.length; j++) {
                    if (array[i] == nonRepeated[j]) {
                        present = true;
                        foundIndex = j;
                    }
                }
                if (!present) {
                    nonRepeated[nonRepeatedCount] = array[i];
                    nonRepeatedCount++;
                } else {
                    repeated[repeatedCount] = array[i];
                    nonRepeated[foundIndex] = null;
                    repeatedCount++;
                }
            }
        }
        traverse(nonRepeated);
        //System.out.println("-------");
        //traverse(repeated);

    }

    public void traverse(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null)
                System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        Integer array[] = {1,2,1,2,2};
        PrintNonRepated pnrc = new PrintNonRepated();
        pnrc.printNonRepated(array);
    }
}
