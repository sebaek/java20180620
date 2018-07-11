package chapter15.section0401;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = (int) (Math.random() * 100) + 1;
        List<String> history = new ArrayList<>();
        
        System.out.println("1~100 맞추기 게임");
        while (true) {
            System.out.print("입력>");
            int guess = scanner.nextInt();
            
            if (guess == number) {
                System.out.println("정답입니다.");
                for (int i = history.size()-1; i >= 0; i--) {
                    System.out.println(history.get(i));
                }
                break;
            } else if (guess > number) {
                System.out.println("더 낮은 수를 입력해보세요.");
                history.add(guess + "입력, 높음");
            } else {
                System.out.println("더 높은 수를 입력해보세요.");
                history.add(guess + "입력, 낮음");
            }
        }

        scanner.close();
    }
}
