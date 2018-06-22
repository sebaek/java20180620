
public class ForMultiplicationTableExample {
	public static void main(String[] args) {
		for (int m = 9; m >= 2; m--) {
			for (int n = 9; n >= 1; n--) {
				System.out.println(m + " x " + n + " = " + (m * n));
			}
			System.out.println("*** " + m + "단 ***");
		}
	}
}
