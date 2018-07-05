package test;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(3);
        list.add(4);

        int s = sum((int) list.get(0), (int) list.get(1));
        System.out.println(s);

        ArrayList<? extends Number> list2 = new ArrayList<>();
        ArrayList<? super Number> list3 = new ArrayList<>();

        list2 = new ArrayList<Integer>();
        list3 = new ArrayList<Integer>();
        
        method1(new ArrayList<Integer>());
        method2(new ArrayList<Object>());
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void method1(List<? extends Number> list) {

    }

    public static void method2(List<? super Number> list) {

    }
}
