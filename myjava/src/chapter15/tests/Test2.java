package chapter15.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test2 {
    public static void main(String[] args) {
        Random random = new Random(System.nanoTime());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(7));
        }
        
        System.out.println(list);
        
        // 1. 중복 제거하고 작은수부터 출력하기
        Set<Integer> set = new TreeSet<>();
        for (int n : list) {
            set.add(n);
        }
        System.out.println(set);
    }
}








