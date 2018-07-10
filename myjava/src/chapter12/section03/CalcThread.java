package chapter12.section03;

public class CalcThread extends Thread {
    CalcThread(String name) {
        setName(name);
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 2000000000; i++) {
            int j = i * 3;
        }
        System.out.println(getName());
    }
}
