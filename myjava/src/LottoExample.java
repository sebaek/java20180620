import java.util.Arrays;

import com.google.myapi.BallPicker;

public class LottoExample {
    public static void main(String[] args) {
        BallPicker ballPicker = new BallPicker(6, 45);
        int[] balls = ballPicker.pickBalls();
        
        System.out.println(Arrays.toString(balls));
        
        ballPicker.baseNumber = 50;
        ballPicker.pickable = 7;
        
        balls = ballPicker.pickBalls(); // 추가된 줄
        System.out.println(Arrays.toString(balls));
        
        ballPicker.baseNumber = 8;
        ballPicker.pickable = 7;
        balls = ballPicker.pickBalls();
        System.out.println(Arrays.toString(balls));
        
        
    }
}





