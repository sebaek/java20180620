package chapter07.excercise09;

import java.util.Scanner;

public class GameApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("게임 모드를 입력해주세요.");
        System.out.println("1.쉬움 | 2.어려움");
        System.out.print("선택>");
        
        int mode = scanner.nextInt();
        
        Game game = GameFactory.getGame(mode);
        
        game.run();
        
        System.out.println("프로그램 종료");
        scanner.close();
        
    }
}
