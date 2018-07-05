package chapter13;

public class ProductList {
    private Product[] list;
    private int size;

    public ProductList() {
        list = new Product[2];
        size = 0;
    }

    public void add(Product product) {
        if (list.length == size) {
            Product[] newList = new Product[list.length * 2];
            for (int i = 0; i < list.length; i++) {
                newList[i] = list[i];
            }
            list = newList;
        }
        list[size++] = product;
    }

    public int size() {
        return size;
    }

    public Product get(int i) {
        return list[i];
    }

}
