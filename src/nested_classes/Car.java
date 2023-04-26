package nested_classes;

public class Car {
    private String color;
    private int doorCount;
    private Engine engine;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car {" +
                "color: '" + color + '\'' +
                ", doorCount: " + doorCount +
                ", engine: " + engine +
                '}';
    }

    public static class Engine {
        private int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "Engine {" +
                    "horsePower: " + horsePower +
                    '}';
        }
    }
}
