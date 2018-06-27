
public class Excercise0507 {
    public static void main(String[] args) {
        int max = 0;
        int[] array = {-1, -5, -3, -8, -2};
        
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        
        System.out.println("max: " + max);
        
        // 최소값을 구하는 방법은?
        // 만약 음수도 섞여 있으면?
        
    }
}
