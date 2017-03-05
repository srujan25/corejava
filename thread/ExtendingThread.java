package thread;

/**
 * Created by SG0221519 on 2/10/2017.
 */
public class ExtendingThread extends Thread{

    public void run(){
        System.out.println("run method in my thread");
    }

    public static void main(String[] args) {
        ExtendingThread ext = new ExtendingThread();
        ext.start();
    }
}
