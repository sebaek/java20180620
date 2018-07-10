package chapter12.test;

public class ThreadTest {
    static int field = 0;
    
    public static void main(String[] args) throws Exception {
        Object lock = new Object();
        Thread threada = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    synchronized (lock) {
                        field++;
                    }
                }
            }
        });
        
        Thread threadb = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    synchronized (lock) {
                        field++;
                    }
                }
            }
        });
        
        threada.start();
        threadb.start();
        threada.join();
        threadb.join();
        
        System.out.println(field);
    }

}
