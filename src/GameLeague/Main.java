package GameLeague;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<League, List<Player>> leagueListMap = new HashMap<>();
        Game game = new Game();

        Generator.makePlayerSecond();
        Generator.makePlayerFirst();
        Generator.makePlayerPrime();

        for (League l : League.values()) {
            if (l != League.INDEFINITE) {
                List<Player> players = PlayersManager.getInstance().getAllPlayersByleague(l);
                game.makeGame(players);
                leagueListMap.put(l, players);
                GamesResult.getTopPlayerLeague(players);
                GamesResult.getWorstPlayerLeague(players);
            }
        }

        //Generator.makePlayerSecond();
        //List<Player> second = PlayersManager.getInstance().getAllPlayersByleague(League.SECOND);
        //game.makeGame(second);
        //System.out.println("--------------------------------------------------------------------");
//
        //Generator.makePlayerFirst();
        //List<Player> first = PlayersManager.getInstance().getAllPlayersByleague(League.FIRST);
        //game.makeGame(first);
        //System.out.println("--------------------------------------------------------------------");
//
        //Generator.makePlayerPrime();
        //List<Player> prime = PlayersManager.getInstance().getAllPlayersByleague(League.PRIME);
        //game.makeGame(prime);
        //System.out.println("--------------------------------------------------------------------");
//
        //System.out.println("Top Players in each League:");
        //GamesResult.getTopPlayerLeague(second);
        //GamesResult.getTopPlayerLeague(first);
        //GamesResult.getTopPlayerLeague(prime);
        //System.out.println("--------------------------------------------------------------------");
//
        //System.out.println("Worst Players in each League:");
        //GamesResult.getWorstPlayerLeague(second);
        //GamesResult.getWorstPlayerLeague(first);
        //GamesResult.getWorstPlayerLeague(prime);
        //System.out.println("--------------------------------------------------------------------");

    }
}
