package com.google.myapi;

public class BallPicker {

    private int pickable;
    private int baseNumber;

    
    
    
    
    public BallPicker(int pickable, int baseNumber) {
        super();
        this.pickable = pickable;
        this.baseNumber = baseNumber;
    }



    public int getPickable() {
        return pickable;
    }



    public void setPickable(int pickable) {
        this.pickable = pickable;
    }



    public int getBaseNumber() {
        return baseNumber;
    }



    public void setBaseNumber(int baseNumber) {
        this.baseNumber = baseNumber;
    }



    public int[] pickBalls() {
        int[] balls = new int[pickable];
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
