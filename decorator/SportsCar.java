package decorator;

/**
 * Created by SG0221519 on 3/15/2017.
 */
public class SportsCar extends CarDecorator {

    public SportsCar(Car car)
    {
        super(car);
    }
    @Override
    public void assemble() {
        super.assemble();
        System.out.println("It is a Sports car...");
    }
}
