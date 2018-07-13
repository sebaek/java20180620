package chapter15.section0503;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapExample3 {
    public static void main(String[] args) {
        TreeMap<String, Integer> treemap = new TreeMap<>();
        treemap.put("apple", 10);
        treemap.put("forever", 60);
        treemap.put("description", 40);
        treemap.put("ever", 50);
        treemap.put("zoo", 10);
        treemap.put("base", 20);
        treemap.put("guess", 70);
        treemap.put("cherry", 30);
        
        System.out.println("[c~f 사이의 단어 검색]");
        NavigableMap<String, Integer> rangeMap = treemap.subMap("c", true, "f", true);
        for (Map.Entry<String, Integer> entry : rangeMap.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue() + "페이지");
        }
    }
}
