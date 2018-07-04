package chapter10;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String data = null;
        if (data == null) {
            System.out.println("data가 널입니다.");
        } else {
            System.out.println(data.toString());
            
        }
    }
}
