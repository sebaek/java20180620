package chapter06;

public class Car {
    final int speed;
    final static int s = 1;
    
    public Car(int speed) {
        this.speed = speed;
    }
    
    void run() {
        System.out.println(speed + "으로 달립니다.");
//        method();
    }
    
    static void method() {
//        run();
    }
    
    public static void main(final String[] args) {
        final int i = 0;
        
//        i = 1;
        
        
//        Car myCar = new Car();
//        myCar.speed = 60;
//        myCar.run();
    }
}
