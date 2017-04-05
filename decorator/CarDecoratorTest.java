package decorator;

/**
 * Created by SG0221519 on 3/15/2017.
 */
public class CarDecoratorTest {
    public static void main(String[] args) {
       SportsCar sc = new SportsCar(new BasicCar());
       sc.assemble();
    }
}
