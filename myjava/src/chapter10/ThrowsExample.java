package chapter10;

public class ThrowsExample {
    public static void main(String[] args) {
            try {
                findClss();
            } catch (ClassNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
    }
    
    public static void findClss() throws ClassNotFoundException {
        Class clazz = Class.forName("java.lang.String2");
    }
}
