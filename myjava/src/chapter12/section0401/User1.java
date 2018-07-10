package chapter12.section0401;

public class User1 extends Thread {
    private Calculator calculator;
    
    public void setCalculator(Calculator calculator) {
        this.setName("User1");
        this.calculator = calculator;
    }
    
    @Override
    public void run() {
        calculator.setMemory(100);
    }
}
