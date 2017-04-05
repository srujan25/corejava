package decorator;

/**
 * Created by SG0221519 on 3/15/2017.
 */
public class BasicCar implements Car {
    @Override
    public void assemble() {
        System.out.println("This is a basic car");
    }
}
