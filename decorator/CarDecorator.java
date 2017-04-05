package decorator;

/**
 * Created by SG0221519 on 3/15/2017.
 */
public class CarDecorator implements Car {

    public Car car;
    public CarDecorator(Car c)
    {
        this.car = c;
    }

    @Override
    public void assemble() {
           this.car.assemble();
    }
}
