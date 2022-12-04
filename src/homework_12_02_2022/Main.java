package homework_12_02_2022;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Generator.makePlayer();
        game.makeGame(PlayersManager.getInstance().getAllPlayersByleague(League.SECOND));
    }
}
