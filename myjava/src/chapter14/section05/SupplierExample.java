package chapter14.section05;

import java.util.function.IntSupplier;

public class SupplierExample {
    public static void main(String[] args) {
        IntSupplier intSupplier = () -> (int) (Math.random() * 6) + 1;
        
        int num = intSupplier.getAsInt();
        System.out.println("눈의 수:" + num);
    }
}
