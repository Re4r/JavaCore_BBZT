package nested_classes;

public class TestCar {
    public static void main(String[] args) {

        Car.Engine engine = new Car.Engine(10000);
        Car car = new Car("Red", 4, engine);

        System.out.println(car);
    }
}
