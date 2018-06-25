
public class Excercise0408 {
	public static void main(String[] args) {
		System.out.println("\n문제1");
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
		System.out.println("\n문제2");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		
		System.out.println("\n문제3");
		for (int i  = 0; i < 5; i++) {
			System.out.println(i * 2);
		}
		
		System.out.println("\n문제4");
		for (int i = 4; i >= 0; i--) {
			System.out.println(i);
		}
		
		System.out.println("\n문제5");
		for (int i = 5; i >= 1; i--) {
			System.out.println(i);
		}
		
		System.out.println("\n문제6");
		for (int i = 10; i >= 2; i -= 2) {
			System.out.println(i);
		}
		
		System.out.println("\n문제7");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("\n문제8");
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >= (4-i); j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("\n문제9");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\n문제10");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < (5-i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\n문제11");
		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (5-i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\n문제12");
		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < (4-i); k++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\n문제13");
		for (int i = 0, k = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++, k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		
		System.out.println("\n문제14");
		for (int i = 0, k = 1; i < 6; i++) {
			for (int j = 0; j <= i; j++, k++) {
				System.out.print(k % 10);
			}
			System.out.println();
		}
		
	}
}
