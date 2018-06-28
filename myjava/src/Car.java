
public class Car {

    String company;
    String model;
    String color;
    int maxSpeed;
    int speed;
    
    Car() {
        company = "현대자동차";
        model = "그랜저";
        color = "검정";
        maxSpeed = 350;
        
    }
    
    Car(String c) {
        company = c;
    }
    
    Car(String c, String m) {
        company = c;
        model = m;
    }
    
}






