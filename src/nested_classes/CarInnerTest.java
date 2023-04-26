package nested_classes;

import nested_classes.CarInner.Engine;

public class CarInnerTest {
    public static void main(String[] args) {

        CarInner car = new CarInner(300, 500);

        Engine engine = new CarInner(400, 200).new Engine(700);
        Engine engine2 = car.new Engine(800);

        System.out.println(car);
        System.out.println(engine);
        System.out.println(engine2);
    }
}
