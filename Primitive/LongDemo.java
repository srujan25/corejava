package Primitive;

/**
 * Created by SG0221519 on 2/16/2017.
 */
public class LongDemo extends Thread {
    @Override
    public void run()
    {

    }
    public static void main(String[] args) throws InterruptedException {
        Long date = 20010101L;
        Thread t = new Thread("Srujan");
        t.sleep(100);
        Thread.sleep(100);
        //Thread t = new Thread("srujan");
        System.out.println(date+1);


    }
}
