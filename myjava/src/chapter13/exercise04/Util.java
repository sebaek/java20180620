package chapter13.exercise04;

public class Util {

    public static <T, U> U getValue(Pair<T, U> pair, T key) {
        if (pair.getKey().equals(key)) {
            return pair.getValue();
        } else {
            return null;
        }
        
    }
    
}
