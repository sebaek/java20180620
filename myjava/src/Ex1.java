
public class Ex1 {
	public static void main(String[] args) {
		int score = (int) (Math.random() * 10000) + 1;
		
		// score가 3의 배수일 경우 "3의 배수입니다" 출력
		// score가 5의 배수일 경우 "5의 배수입니다" 출력
		// score가 3의 배수이고 5의 배수일 경우 
		// "3과 5의 배수입니다" 출력
		
		if (score % 15 == 0) {
			System.out.println("3과 5의 배수입니다.");
		} else if (score % 3 == 0) {
			System.out.println("3의 배수입니다.");
		} else if (score % 5 == 0) {
			System.out.println("5의 배수입니다.");
		}
	}
}
