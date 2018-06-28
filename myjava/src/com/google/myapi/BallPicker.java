package com.google.myapi;

public class BallPicker {

    public int pickable;
    public int baseNumber;
    
    public BallPicker(int pickable, int baseNumber) {
        this.pickable = pickable;
        this.baseNumber = baseNumber;
    }

    public int[] pickBalls() {
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
    
    private boolean isNew(int ball, int[] balls) {
        for (int i = 0; i < pickable; i++) {
            if (balls[i] == ball) {
                return false;
            }
        }
        return true;
    }
    
    private int getRandomNumber() {
        return (int) (Math.random() * this.baseNumber) + 1;
    }
    
    
    
}
