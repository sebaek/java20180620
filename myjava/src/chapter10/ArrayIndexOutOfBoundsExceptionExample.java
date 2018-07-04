package chapter10;

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("배열의 길이가 2보다 작습니다.");
        } else {
        
            String data1 = args[0];
            String data2 = args[1];
            
            System.out.println("args[0]" + data1);
            System.out.println("args[1]" + data2);
        }
    }
}
