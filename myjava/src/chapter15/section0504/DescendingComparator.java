package chapter15.section0504;

import java.util.Comparator;

public class DescendingComparator implements Comparator<Fruit> {

    @Override
    public int compare(Fruit o1, Fruit o2) {
        return o1.price - o2.price;
    }

}
