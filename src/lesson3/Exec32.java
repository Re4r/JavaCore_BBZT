package lesson3;

public class Exec32 {
    public static void main(String[] args) {

        Info<String> info = new Info<>("Hello");
        System.out.println(info);
        Info<Integer> info1 = new Info<>(444);
        System.out.println(info1);

    }
}

class Info<T> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Info: " + "value = " + value;
    }
}
