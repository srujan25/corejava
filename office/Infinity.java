package office;

/**
 * Created by SG0221519 on 5/17/2017.
 */
public class Infinity {
    public static void main(String[] args) {
        double newC = 0.2*5.7/0.0;
        System.out.println(newC);

        long factor = (long) Math.pow(10, 2);

        // Shift the decimal the correct number of places
        // to the right.
        newC = newC * factor;
        System.out.println(newC);
        long tmp = Math.round(newC);
        System.out.println("temp-->"+tmp);
        // Shift the decimal the correct number of places
        // back to the left.
        System.out.println((double) tmp / factor);
        //return (double) tmp / factor;
    }
}
