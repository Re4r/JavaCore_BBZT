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

    public class Engine {
        private int power;

        public Engine(int power) {
            this.power = power;
        }

        @Override
        public String toString() {
            return "Engine: " +
                    "power: " + power;
        }
    }
}
