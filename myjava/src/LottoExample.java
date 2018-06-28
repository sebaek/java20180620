import java.util.Arrays;

import com.google.myapi.BallPicker;

public class LottoExample {
    public static void main(String[] args) {
        BallPicker ballPicker = new BallPicker(6, 45);
        int[] balls = ballPicker.pickBalls();

        System.out.println(Arrays.toString(balls));

        // System.out.println("baseNumber를 바꿉니다.");
        // ballPicker.baseNumber = 50;
        ballPicker.setBaseNumber(50);

        // System.out.println("pickable를 바꿉니다.");
        // ballPicker.pickable = 7;
        ballPicker.setPickable(7);

        balls = ballPicker.pickBalls(); // 추가된 줄
        System.out.println(Arrays.toString(balls));

        // System.out.println("baseNumber를 바꿉니다.");
        // ballPicker.baseNumber = 8;
        ballPicker.setBaseNumber(8);

        // System.out.println("pickable를 바꿉니다.");
        // ballPicker.pickable = 7;
        ballPicker.setPickable(7);

        balls = ballPicker.pickBalls();
        System.out.println(Arrays.toString(balls));

    }
}
