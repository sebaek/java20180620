package chapter11.section12;

public class AutoBoxingUnBoxingExample {
    public static void main(String[] args) {
        Integer obj = 100;
        System.out.println("value: " + obj.intValue());
        
        int value = obj;
        System.out.println("vaule: " + value);
        
        int result = obj + 100;
        System.out.println("result: " + result);
    }
}
