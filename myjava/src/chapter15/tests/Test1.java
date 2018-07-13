package chapter15.tests;

import java.util.ArrayList;
import java.util.Collections;
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
        
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : list) {
            sum += n;
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        System.out.println("sum : " + sum);
        System.out.println("avg : " + (double) sum / list.size());
        System.out.println("max : " + max);
        System.out.println("min : " + min);
        
        // 4. 정렬하기
        Collections.sort(list);
        System.out.println(list);
        
    }
}









