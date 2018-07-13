package chapter15.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        Random random = new Random(System.nanoTime());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list);
        
        // 1. 합
        // 2. 평균
        // 3. 최대값 최소값
        // 4. 정렬하기
        
    }
}
