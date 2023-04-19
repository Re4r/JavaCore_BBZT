package generic;

public class TwoCellsBox<T, S> {
    private T firstCellItem;
    private S secondCellItem;


    public TwoCellsBox(T firstCellItem, S secondCellItem) {
        this.firstCellItem = firstCellItem;
        this.secondCellItem = secondCellItem;
    }

    public T getFirstCellItem() {
        return firstCellItem;
    }

    public S getSecondCellItem() {
        return secondCellItem;
    }
}
