package chapter11.section12;

public class ValueCompareExample {
    public static void main(String[] args) {
        System.out.println("[-128~127 초과값일 경우]");
        Integer obj1 = 300;
        Integer obj2 = 400;
        System.out.println("== 결과: " + (obj1 == obj2));
        System.out.println("언박싱후 == 결과 : " + (obj1.intValue() == obj2.intValue()));
        System.out.println("equals() 결과 : " + obj1.equals(obj2));
        System.out.println(obj1 <= obj2);
        System.out.println(obj1.compareTo(obj2) < 0);
        System.out.println();
        
        System.out.println("[-128~127 범위값일 경우]");
        Integer obj3 = 3;
        Integer obj4 = 3;
        System.out.println("== 결과: " + (obj3 == obj4));
        System.out.println("언박싱후 == 결과 : " + (obj3.intValue() == obj4.intValue()));
        System.out.println("equals() 결과 : " + obj3.equals(obj4));
        System.out.println();
        
    }
}
