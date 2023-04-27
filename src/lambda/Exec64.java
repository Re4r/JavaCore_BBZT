package lambda;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Supplier;

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

    }

    static <T> ArrayList<T> createCars(Supplier<T> supplier) {
        ArrayList<T> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(supplier.get());
        }
        return list;
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

    @Override
    public String toString() {
        return "Car{" +
                "maxSpeed=" + maxSpeed +
                ", horsePower=" + horsePower +
                ", acceleration=" + acceleration +
                '}';
    }
}
