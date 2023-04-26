package nested_classes;

public class CarInner {
    private int speed;

    public CarInner(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "CarInner: " +
                "speed: " + speed;
    }
}
