package chapter11.section12;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        int[] intArray = new int[3];
        
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 77;
        
        int[] newArray = new int[6];
        for (int i = 0; i < intArray.length; i++) {
            newArray[i] = intArray[i];
        }
        newArray = intArray;
        
        newArray[3] = 88;
        
        ArrayList list = new ArrayList();
        list.add(new Integer(3));
        list.add(3);
        list.add(new Integer(2));
        list.add(new Integer(77));
        
        int i1 = (Integer) list.get(0);
        Integer i2 = (Integer) list.get(1);
        
        
        
        
    }
}






