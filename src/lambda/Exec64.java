package lambda;

import java.util.function.Supplier;

public class Exec64 {
    public static void main(String[] args) {

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
