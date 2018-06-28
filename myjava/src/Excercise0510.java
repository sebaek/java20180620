import java.util.Arrays;
import java.util.Random;

public class Excercise0510 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(13);
        }
        
        Arrays.sort(array);
        
        System.out.println(Arrays.toString(array));
        // 1~10의 임의의 값이 정렬된 배열에서
        // 더해서 13이 되는 쌍이 있는 지 확인하는
        // 코드를 작성해보세요.
        // 배열을 한번만 탐색해서 완성해보도록 하세요.
    }
}
