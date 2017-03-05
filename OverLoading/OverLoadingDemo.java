package OverLoading;

/**
 * Created by SG0221519 on 2/11/2017.
 */
public class OverLoadingDemo {

    public void hello(String str)
    {
        System.out.println("hello method");
    }

    //1. In overloading if I am trying to over load a method with different return type, it will consider as duplicate method and it throws CE.
    //2. In Overloading return type, method name has to be same and parameters can vary.
    /*public int hello(String str)
    {
        return "This is hello "+str;
    }*/

    public static void main(String[] args)
    {
        OverLoadingDemo old = new OverLoadingDemo();
        old.hello("sru");
    }
}
