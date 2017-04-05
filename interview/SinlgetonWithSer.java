package interview;

import java.io.Serializable;

/**
 * Created by SG0221519 on 3/15/2017.
 */
public class SinlgetonWithSer implements Serializable{

    private static SinlgetonWithSer instance = null;
    private String dbConnection = null;
    private SinlgetonWithSer()
    {
        dbConnection = new String("db connection");
        System.out.println("In Constructor");
    }

    public static SinlgetonWithSer getInstance()
    {
        if(instance == null)
        {
            new SinlgetonWithSer();
        }
        return instance;
    }

    protected Object readResolve() {
        return getInstance();
    }
}
