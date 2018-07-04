package chapter10;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        String data1 = "100";
        String data2 = "a100";

        String regex = "^\\d*\\.\\d+|\\d+\\.\\d*$";
        // String string = "123.43253";

        int value1 = Integer.parseInt(data1);
        int value2 = 0;

        if (data2.matches(regex)) {
            value2 = Integer.parseInt(data2);
        } else {
            System.out.println("변환할 수 없습니다.");
        }

        int result = value1 + value2;
        System.out.println(data1 + "+" + data2 + "=" + result);
    }
}
