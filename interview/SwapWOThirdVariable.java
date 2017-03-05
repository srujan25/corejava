package interview;

/**
 * Created by SG0221519 on 2/17/2017.
 */
public class SwapWOThirdVariable {

    public static void main(String[] args) {
        int a= 50;
        int b=70;

        a=a+b;

        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);

    }
}
