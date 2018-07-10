package chapter12.section0201;

public class BeepTask implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.err.println("소리");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                
            }
        }
    }
}
