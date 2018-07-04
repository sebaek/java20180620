package test;

import java.util.stream.IntStream;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = IntStream.range(0, 100000000).parallel().map(x -> x * 2).toArray();
        for (int i = 1; i < 10; i++) {
            if (arr[i] < arr[i - 1]) {
                System.out.println(arr[i]);
                System.out.println(arr[i - 1]);
            }
        }
        
        System.out.println("끝");
    }
}
