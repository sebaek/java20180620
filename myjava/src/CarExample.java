
public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        Car myCar3 = new Car("기아자동차");
        Car myCar4 = new Car("bmw");
        Car myCar5 = new Car("기아자동차", "k3");
        
        System.out.println(myCar5.company);
        System.out.println(myCar5.model);
        System.out.println(myCar3.company);
        System.out.println(myCar4.company);
        
        System.out.println("제작회사: " + myCar.company);
        System.out.println("모델명: " + myCar.model);
        System.out.println("색깔: " + myCar.color);
        System.out.println("최고속도: " + myCar.maxSpeed);
        System.out.println("현재속도: " + myCar.speed);
        
        myCar.speed = 60;
        System.out.println("수정된 속도: " + myCar.speed);
        
        Car myCar2 = new Car();
        myCar2.company = "기아";
        System.out.println("제작회사: " + myCar2.company);
        System.out.println("모델명: " + myCar2.model);
        System.out.println("색깔: " + myCar2.color);
        System.out.println("최고속도: " + myCar2.maxSpeed);
        System.out.println("현재속도: " + myCar2.speed);
        
        myCar.speed = 60;
        System.out.println("수정된 속도: " + myCar2.speed);
        
    }
}
