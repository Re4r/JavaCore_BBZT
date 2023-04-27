package lambda;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Supplier;
import java.util.function.Consumer;

public class Exec64 {
    public static void main(String[] args) {

        ArrayList<Car> cars = createCars(new Supplier<Car>() {
            @Override
            public Car get() {
                return new Car(new Random().nextInt(1000),
                        new Random().nextInt(1000),
                        new Random().nextDouble(100));
            }
        });

        cars.forEach(System.out::println);
        System.out.println("---------------------------------------------------------------------------------------");

        changeCars(cars, new Consumer<Car>() {
            @Override
            public void accept(Car car) {
                car.setMaxSpeed(new Random().nextInt(100));
                car.setHorsePower(new Random().nextInt(100));
                car.setAcceleration(new Random().nextDouble(10));
            }
        });

        cars.forEach(car -> System.out.println(car));
        System.out.println("---------------------------------------------------------------------------------------");


    }

    static <T> ArrayList<T> createCars(Supplier<T> supplier) {
        ArrayList<T> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(supplier.get());
        }
        return list;
    }

    static <T> void changeCars(ArrayList<T> list, Consumer<T> consumer) {
        for (var t : list) {
            consumer.accept(t);

        }
    }
}

class Car {
    private int maxSpeed;
    private int horsePower;
    private double acceleration;

    public Car(int maxSpeed, int horsePower, double acceleration) {
        this.maxSpeed = maxSpeed;
        this.horsePower = horsePower;
        this.acceleration = acceleration;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setAcceleration(double acceleration) {
        this.acceleration = acceleration;
    }

    @Override
    public String toString() {
        return "Car{" +
                "maxSpeed: " + maxSpeed +
                ", horsePower: " + horsePower +
                ", acceleration: " + acceleration +
                '}';
    }
}
