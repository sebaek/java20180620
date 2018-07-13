package chapter15.tests;

import java.io.File;
import java.net.URLDecoder;
import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) throws Exception {
        String path = Test10.class.getResource("numbers.txt").getPath();
        path = URLDecoder.decode(path, "utf-8");
        File file = new File(path);
        
        Scanner scanner = new Scanner(file);
        
        long maxEndingHere = 0;
        long maxSoFar = 0;
        maxEndingHere = maxSoFar = scanner.nextInt();
        
        while (scanner.hasNextInt()) {
            int next = scanner.nextInt();
            maxEndingHere = Math.max(next, maxEndingHere + next);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        
        System.out.println(maxSoFar);
        
        scanner.close();
    }
}
