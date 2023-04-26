package nested_classes;

public class CarInner {
    private int speed;
    private Engine engine;

    public CarInner(int speed, int power) {
        this.speed = speed;
        this.engine = this.new Engine(power);
    }

    @Override
    public String toString() {
        return "CarInner: " +
                "speed: " + speed +
                ", engine: " + engine;
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
