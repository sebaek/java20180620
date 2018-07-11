package chapter15.section0401;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Exercise01 {
    public static void main(String[] args) {
        Random random = new Random(System.currentTimeMillis());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            list.add(random.nextInt(10));
        }
        
        System.out.println(list);
        
        // 코드 작성
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer n : list) {
            if (map.containsKey(n)) {
                Integer old = map.get(n);
                map.put(n, old + 1);
            } else {
                map.put(n, 1);
            }
        }
        
        for (Integer key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}
