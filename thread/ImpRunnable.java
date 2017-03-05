package thread;

import org.omg.CORBA.IMP_LIMIT;

/**
 * Created by SG0221519 on 2/10/2017.
 */
public class ImpRunnable implements  Runnable{

    public void run()
    {

        System.out.println("run in my Runnable");
    }

    public static void main(String[] args) {
        ImpRunnable imp = new ImpRunnable();
        Thread t = new Thread(imp);
        t.start();
    }
}

