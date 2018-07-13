package chapter15.tests;

public class Test11 {
    public static void main(String[] args) {
        
        int[] array = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        
        int maxsofar = array[0];
        int maxendhere = array[0];
        
        for (int i = 1; i < array.length; i++) {
            maxendhere = Math.max(array[i], maxendhere + array[i]);
            maxsofar = Math.max(maxendhere, maxsofar);
        }
        
        System.out.println(maxsofar);
    }

}
