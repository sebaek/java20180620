import java.util.Scanner;

public class Excercise0407 {
	public static void main(String[] args) {
		boolean run = true;

		int balance = 0;

		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------------");
			System.out.print("선택>");

			String n = scanner.next();
			
			switch (n) {
			case "1":
				System.out.print("입금액>");
				balance += scanner.nextInt();
				break;
			case "2":
				System.out.print("출금액>");
				balance -= scanner.nextInt();
				break;
			case "3":
				System.out.println("잔고>" + balance);
				break;
			case "4":
				run = false;
				break;

			default:
				break;
			}
		}
		
		System.out.println("프로그램 종료");
		scanner.close();
	}
}
