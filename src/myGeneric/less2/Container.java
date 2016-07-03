package myGeneric.less2;

/**
 * Created by Denni on 10.06.2016.
 */
public class Container<T extends Product> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
