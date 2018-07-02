package chapter07.section08;

public class MainApp {
    public static void main(String[] args) {
        
        
        Phone phone1 = PhoneBroker.getInstance("galaxy");
        
        phone1.call();
        
        Phone phone2 = PhoneBroker.getInstance("xaomi");
        
        phone2.call();
    }

}
