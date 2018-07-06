package test;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.forEach(new Consumer<Integer>() {
            public void accept(Integer t) {
                System.out.println(t);
                
            }
        });
        
        list.forEach((v) -> {
            System.out.println(v);
        });
        
        list.forEach((v) -> System.out.println(v));
        
        list.forEach(v -> System.out.println(v));
            
    }
}
