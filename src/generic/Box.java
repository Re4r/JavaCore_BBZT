package generic;

public class Box<T extends Garbage> {
    private T item;

    public Box(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public double getItemWeight() {
        return item == null ? 0 : item.getWeight();

    }

    @Override
    public String toString() {
        return "Box{" +
                "item=" + item +
                '}';
    }
}
