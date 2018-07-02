package chapter07.section0704;

public class DrivereExample {
    public static void main(String[] args) {
        Driver driver = new Driver();
        
        Bus bus = new Bus();
        Taxi taxi = new Taxi();
        
        Vehicle v = bus;
        
        if (v instanceof Bus) {
            Bus s = (Bus) v;
        }
        
        if (v instanceof Taxi) {
            Taxi t = (Taxi) v;
        }
        
        System.out.println(v instanceof Bus);
        System.out.println(v instanceof Vehicle);
        System.out.println(v instanceof Taxi);
        
        driver.drive(v);
//        driver.drive(s);
        driver.drive(bus);
        driver.drive(taxi);
    }
}
