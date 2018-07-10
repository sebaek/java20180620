package chapter15.section0201;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("홍길동", "신용권", "감자바");
        for (String name : list1) {
            System.out.println(name);
        }

        List<Integer> list2 = Arrays.asList(1, 2, 3);
        for (int value : list2) {
            System.out.println(value);
        }
        
        List<Integer> list3 = Arrays.asList(new Integer[] {1, 2, 3});
        for (Integer value : list3) {
            System.out.println(value);
        }
    }
}
