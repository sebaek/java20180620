package chapter06;

public class Calculator {
    static double pi;
    
    static {
        System.out.println("pi에 값을 세팅중");
        pi = 3.14159;
    }
    
    
    static int plus(int x, int y) {
        return x + y;
    }
    
    static int minus(int x, int y) {
        return x - y;
    }
}
