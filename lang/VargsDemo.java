package lang;

/**
 * Created by SG0221519 on 2/8/2017.
 */
public class VargsDemo {

    public void varArgsDemo(int...a)
    {
        System.out.println(a.length);
    }

    public static void main(String[] args) {
        VargsDemo vd = new VargsDemo();
        vd.varArgsDemo(10,12,12);
    }
}
