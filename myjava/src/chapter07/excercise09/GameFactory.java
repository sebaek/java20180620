package chapter07.excercise09;

public class GameFactory {

    public static Game getGame(int mode) {
        Game game = null;
        switch (mode) {
        case 1:
            game = new EasyGame();
            break;
        case 2:
            game = new HardGame();
            break;
        default:

        }
        return game;
    }

}
