package chapter14.exercise04;

import java.util.function.IntSupplier;

public class LambdaExample {
    public static int method(int x, int y) {
        IntSupplier supplier = () -> {
            int z = x * 10;
            int result = z + y;
            return result;
        };
        int result = supplier.getAsInt();
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println(method(3, 5));
    }
}
