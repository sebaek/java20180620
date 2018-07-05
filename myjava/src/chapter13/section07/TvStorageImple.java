package chapter13.section07;

public class TvStorageImple implements Storage<Tv> {
    private Tv[] array;

    public TvStorageImple(int capacity) {
        this.array = new Tv[capacity];
    }
    
    @Override
    public void add(Tv item, int index) {
        array[index] = item;
    }

    @Override
    public Tv get(int index) {
        return array[index];
    }

}
