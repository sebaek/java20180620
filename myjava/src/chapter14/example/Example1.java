package chapter14.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {
        Integer[] intArray = new Integer[45];
        
        Arrays.setAll(intArray, x -> x+1);
        
        //코드 작성
        Arrays.sort(intArray, (x, y) -> y - x);
        
        for (int i : intArray) {
            System.out.println(i);
        }
        
        System.out.println("----------------");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        
        list.removeIf(e -> (e % 3) != 0);
        
        list.forEach(System.out::println);

    }
    
    
}





