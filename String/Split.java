package String;

/**
 * Created by SG0221519 son 6/14/2017.
 */
public class Split {
    public static void main(String[] args) {
        String emptyString = "  ";
        String s = "76255.00"+"|"+emptyString;
        //System.out.println(s);
        String[] split = s.split("\\|");
        System.out.println(split[0]);
        System.out.println(split[1]+"--");

    }
}
