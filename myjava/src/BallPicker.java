
public class BallPicker {

    int pickable;
    int baseNumber;
    
    BallPicker(int pickable, int baseNumber) {
        this.pickable = pickable;
        this.baseNumber = baseNumber;
    }

    int[] pickBalls() {
        int[] balls = new int [pickable];
        int picked = 0;
        
        while (picked < pickable) {
            int ball = getRandomNumber();
            if (isNew(ball, balls)) {
                balls[picked] = ball;
                picked++;
            }
        }
        
        return balls;
    }
    
    boolean isNew(int ball, int[] balls) {
        for (int i = 0; i < pickable; i++) {
            if (balls[i] == ball) {
                return false;
            }
        }
        return true;
    }
    
    int getRandomNumber() {
        return (int) (Math.random() * this.baseNumber) + 1;
    }
    
    
    
}
