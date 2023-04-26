package nested_classes;

public class Exec55 {
    public static void main(String[] args) {

        MathOperation mathOperation1 = new MathOperation() {
            @Override
            public int doOperation(int x, int y) {
                return x * y;
            }
        };

        MathOperation mathOperation2 = new MathOperation() {
            @Override
            public int doOperation(int x, int y) {
                return (int) Math.pow(x, y);
            }
        };

        Soom soom = new Soom() {
            @Override
            double doSomething(int x, int y) {
                return super.doSomething(x, y) + x * y;
            }
        };

        int w = mathOperation1.doOperation(5, 7);
        System.out.println(w);
        int t = mathOperation2.doOperation(2, 4);
        System.out.println(t);
        System.out.println(soom.doSomething(4, 9));

    }
}

interface MathOperation {
    int doOperation(int x, int y);
}

class Soom {
    double doSomething(int x, int y) {
        return x / y;
    }
}
