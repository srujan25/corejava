package interview;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.LocatorEx;

/**
 * Created by SG0221519 on 2/14/2017.
 */
public class Singleton implements Cloneable {

    private static transient Singleton instance = null;
    private String databaseConnection;

    private Singleton() {
        System.out.println("Object Creation");
        databaseConnection = new String("connection got");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            //System.out.println("First time created");
            instance = new Singleton();
        }
        return instance;
    }

    // if you override as below you are not going to get new connection, it returns same connection, so even clone will get new connection
   /* public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }*/

    //As below we can create a another object for Single ton class.
    public Object clone()
    {
        return instance = new Singleton();
    }

    //Test method
    public static void main(String[] args) throws CloneNotSupportedException {

        Singleton instance = Singleton.getInstance();//Constructor will be called here.
        System.out.println(instance.databaseConnection);
        Singleton instance2 = Singleton.getInstance(); //Constructor will not be called here, since instance reference is not null
        System.out.println(instance2.databaseConnection);
        Singleton cloneInstance = (Singleton) instance.clone();//Cloning the object and constructor will be called here again, so by using clone we can break the rule of Single ton.
        System.out.println(cloneInstance.databaseConnection);

    }

}