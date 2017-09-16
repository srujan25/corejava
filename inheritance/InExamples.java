package inheritance;

/**
 * Created by SG0221519 on 2/12/2017.
 */
public class InExamples {

    public String str = "Super";

    public void  hello() {
        System.out.println("This is super hello() ");
    }
}

class InExampleSub extends InExamples {

    public String str = "Sub";

    public void hello() {
        System.out.println("This is sub hello()");
    }


    public static void main(String[] args) {

        //1. By using below statement I always SynchronizedGet Sub class overridden methods and always SynchronizedGet super class variables.
        InExamples ine = new InExampleSub();
        ine.hello();//This is sub hello()
        System.out.println(ine.str);//Super
    }

}
