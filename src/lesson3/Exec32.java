package lesson3;

public class Exec32 {
    public static void main(String[] args) {

//        Info<String> info = new Info<>("Hello");
//        String s = info.getValue();
//        System.out.println(info);
//        System.out.println(s);
//        Info<Integer> info1 = new Info<>(444);
//        Integer i = info1.getValue();
//        System.out.println(info1);
//        System.out.println(i);

        Pair<Integer, String> pair = new Pair<>(100, "Hundred");
        System.out.println(pair);
        System.out.println(pair.getV1()+ " - " + pair.getV2());

    }
}

class Info<T> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Info: " + "value = " + value;
    }
}

class Pair<V1, V2> {
    private V1 v1;
    private V2 v2;

    public Pair(V1 v1, V2 v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    public V1 getV1() {
        return v1;
    }

    public V2 getV2() {
        return v2;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "v1 = " + v1 +
                ", v2 = " + v2 +
                '}';
    }
}
