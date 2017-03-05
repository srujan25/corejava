package inheritance;

/**
 * Created by SG0221519 on 2/3/2017.
 */
public class FinalOverRide {

    final void hello()
    {
        System.out.println("hello");
    }

    static void hai()
    {

    }


}

class SubClass extends FinalOverRide{

    //Below method throws compilation issues due to final methods cannot override
    /*void hello()
    {

    }*/

    static void hai()
    {
        
    }
}
