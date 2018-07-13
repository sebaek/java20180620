package chapter15.section0502;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample3 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("f");
        treeSet.add("c");
        treeSet.add("apple");
        treeSet.add("forever");
        treeSet.add("description");
        treeSet.add("ever");
        treeSet.add("zoo");
        treeSet.add("base");
        treeSet.add("guess");
        treeSet.add("cherry");
        
        Integer a = 3;
        Integer b = 4;
        System.out.println(a.compareTo(b));
        System.out.println("f".compareTo("forever"));
        
        System.out.println("[c~f 사이의 단어 검색]");
        NavigableSet<String> rangeSet = treeSet.subSet("c", false, "f", false);
        for (String word : rangeSet) {
            System.out.println(word);
        }
    }
}






