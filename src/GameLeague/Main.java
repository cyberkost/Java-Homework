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
    }
}
