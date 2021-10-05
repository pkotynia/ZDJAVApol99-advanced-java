package collections;

public class Box<T> {

    private T item;

    public void put(T item) {
        this.item = item;
    }

    public T pullOut() {
        return item;
    }


}
