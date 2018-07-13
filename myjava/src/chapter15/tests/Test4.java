package chapter15.tests;

import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {
        String words = "connection,care,gravel,galaxy,basic,slab,complete,psychology,railcar,car";
        
        // 정렬된 순으로 출력하기
        // basic,car,care,complete,connection,galaxy,gravel,psychology,railcar,slab
        String[] array = words.split(",");
        Arrays.sort(array);
        String join = String.join(",", array);
        System.out.println(join);
    }
}
