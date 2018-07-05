package chapter13.section07;

public class StorageImple<T> implements Storage<T> {
    private T[] array;
    
    public StorageImple(int capacity) {
        this.array = (T[]) (new Object[capacity]);
    }
    
    @Override
    public void add(T item, int index) {
        array[index] = item;
    }

    @Override
    public T get(int index) {
        return array[index];
    }

}
