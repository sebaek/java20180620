package chapter14;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Example {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("워너원");
        list.add("블핑");
        list.add("방탄");
        
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
        
//        list.forEach(new MyConsumer());
        
//        list.forEach(new Consumer<String>() {
//            public void accept(String t) {
//                System.out.println(t);
//            }
//        });
        
//        list.forEach((String t) -> {
//            System.out.println(t);
//        });
        
//        list.forEach((String t) -> System.out.println(t));
        
//        list.forEach((t) -> System.out.println(t));
        
        list.forEach(t -> System.out.println(t));
    }
}





