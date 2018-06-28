
public class Excercise0507 {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int[] array = {-1, -5, -3, -8, -2};
        
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        
        System.out.println("max: " + max);
        
        // 최소값을 구하는 방법은?
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        
        System.out.println("min: " + min);
        
        
        
        
        // 만약 음수도 섞여 있으면?
        
    }
}
