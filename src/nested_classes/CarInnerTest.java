package nested_classes;

public class CarInnerTest {
    public static void main(String[] args) {

        CarInner car = new CarInner(300, 500);

        CarInner.Engine engine = new CarInner(400, 200).new Engine(700);

        System.out.println(car);
        System.out.println(engine);
    }
}
