package chapter12.section0201;

public class BeepPrintExample1 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.err.println("소리");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
               
            }
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                
            }
        }
    }
}
