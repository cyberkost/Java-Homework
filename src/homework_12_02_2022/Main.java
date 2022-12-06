package homework_12_02_2022;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();

        Generator.makePlayerSecond();
        List<Player> second = PlayersManager.getInstance().getAllPlayersByleague(League.SECOND);
        game.makeGame(second);
        System.out.println("--------------------------------------------------------------------");

        Generator.makePlayerFirst();
        List<Player> first = PlayersManager.getInstance().getAllPlayersByleague(League.FIRST);
        game.makeGame(first);
        System.out.println("--------------------------------------------------------------------");

        Generator.makePlayerPrime();
        List<Player> prime = PlayersManager.getInstance().getAllPlayersByleague(League.PRIME);
        game.makeGame(prime);
        System.out.println("--------------------------------------------------------------------");

        System.out.println("Top Players in each League:");
        GamesResult.getTopPlayerLeague(second);
        GamesResult.getTopPlayerLeague(first);
        GamesResult.getTopPlayerLeague(prime);
        System.out.println("--------------------------------------------------------------------");

        System.out.println("Worst Players in each League:");
        GamesResult.getWorstPlayerLeague(second);
        GamesResult.getWorstPlayerLeague(first);
        GamesResult.getWorstPlayerLeague(prime);
        System.out.println("--------------------------------------------------------------------");
    }
}
