package chapter13.section04;

public class BoundedTypeParameterExample {
    public static void main(String[] args) {
//        int str = Util.compare("a", "b");
        
        int result1 = Util.<Integer>compare(10, 20);
        System.out.println(result1);
        
        int result2 = Util.compare(4.5, 3);
        System.out.println(result2);
    }
}
