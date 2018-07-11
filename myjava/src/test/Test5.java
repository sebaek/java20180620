package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test5 {
    public static void main(String[] args) {
        // System.out.println('z' - 'a' + 1 + 10);
        for (int i = 0; i < 8; i++) {
            System.out.printf("%3d : %,20.0f%n", i, Math.pow(26, i));
        }
        System.out.println();

        for (int i = 0; i < 8; i++) {
            System.out.printf("%3d : %,20.0f%n", i, Math.pow(36, i));
        }
        System.out.println();

        for (int i = 0; i < 8; i++) {
            System.out.printf("%3d : %,20.0f%n", i, Math.pow(62, i));
        }
        System.out.println();
        
        List<Character> list = new ArrayList<>();
//        for (char c = 'a'; c <= 'z'; c++) {
//            list.add(c);
//        }
        for (char c = 'A'; c <= 'Z'; c++) {
            list.add(c);
        }
        for (char c = '0'; c <= '9'; c++) {
            list.add(c);
        }
        
        String s = "";
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < 7; i++) {
            s += list.get(random.nextInt(list.size()));
        }
        System.out.println(list.size());
        System.out.println(s);
    }
}
