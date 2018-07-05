package chapter13;

public class ObjectList {
    private Object[] list;
    private int size;

    public ObjectList() {
        list = new Object[2];
        size = 0;
    }

    public void add(Object obj) {
        if (list.length == size) {
            Object[] newList = new Object[list.length * 2];
            for (int i = 0; i < list.length; i++) {
                newList[i] = list[i];
            }
            list = newList;
        }
        list[size++] = obj;
    }

    public int size() {
        return size;
    }

    public Object get(int i) {
        return list[i];
    }
}
