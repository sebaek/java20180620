package chapter08;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        
        myCar.run();
        
        myCar.tires[0] = new KumhoTire();
        myCar.tires[1] = new KumhoTire();
        
        myCar.run();
    }
}
