package chapter15.section0504;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorExample {
    public static void main(String[] args) {
        
        TreeSet<Fruit> treeSet = new TreeSet<>((o1, o2) -> o2.price - o1.price);
        treeSet.add(new Fruit("포도", 3000));
        treeSet.add(new Fruit("수박", 10000));
        treeSet.add(new Fruit("딸기", 6000));
        
        Iterator<Fruit> iterator = treeSet.iterator();
        while(iterator.hasNext()) {
            Fruit fruit = iterator.next();
            System.out.println(fruit.name + ":" + fruit.price);
        }
    }
}
