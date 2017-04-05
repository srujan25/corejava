package decorator;

/**
 * Created by SG0221519 on 3/15/2017.
 */
public class LuxuryCar extends CarDecorator {

    public LuxuryCar(Car c)
    {
        super(c);
    }
    @Override
    public void assemble() {
        super.assemble();
        System.out.println("This is a Luxury car");
    }
}
