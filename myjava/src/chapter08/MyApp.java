package chapter08;

public class MyApp {

    public static void main(String[] args) {
        
        MyInterface obj = MyFactory.getInstance();
        
        obj.method();
        
    }
    
    
}
