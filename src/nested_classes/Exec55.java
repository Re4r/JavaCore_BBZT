package nested_classes;

public class Exec55 {
    public static void main(String[] args) {

        MathOperation mathOperation = new MathOperation() {
            @Override
            public int doOperation(int x, int y) {
                return x * y;
            }
        };

    }
}

interface MathOperation {
    int doOperation(int x, int y);
}
