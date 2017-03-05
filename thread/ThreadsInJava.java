package thread;

class UserThread extends Thread {
    @Override
    public void run() {
        for (Long i = 0l; i < 10000000000l; i++) {
            //System.out.println("This is daemon thread....."+i);
        }
        System.out.println("This is a user thread.....");
    }
}

class DaemonThread extends Thread {
    public DaemonThread() {
        setDaemon(true);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("This is daemon thread....." + i);
        }
    }
}

public class ThreadsInJava {
    public static void main(String[] args) {
        DaemonThread daemon = new DaemonThread();   //Creating the DaemonThread

        daemon.start();                 //Starting the daemon thread

        UserThread userThread = new UserThread();   //Creating the UserThread

        userThread.start();          //Starting the user thread
    }
}