package chapter10;

public class MyClass {
    public static void main(String[] args) {
        method1(3);
    }

    private static void method1(int i) {
        method2(i);
    }

    private static void method2(int i) throws Exception {
        if (i < 10) {
            throw new RuntimeException("10보다 작습니다."); 
        }
    }
    
    
}
