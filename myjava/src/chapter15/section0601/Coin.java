package chapter15.section0601;

public class Coin {
    private int value;

    public Coin(int value) {
        super();
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    
    @Override
    public String toString() {
        return value + "원";
    }
}
