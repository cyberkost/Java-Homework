package gameLeague;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class GamesResult {
    public static void getTopPlayerLeague(List<Player> players) {
        System.out.println("--------------------------------------------------------------------");
        List<Player> bestThree = new ArrayList<>();
        bestThree.add(players.get(0));
        Game.printPlayers(bestThree);

    }

    public static void getWorstPlayerLeague(List<Player> players) {
        List<Player> worstPlayers = new ArrayList<>();
        ListIterator<Player> iterator = players.listIterator(players.size());
        for (int i = players.size(); i > players.size() - 1; i--) {
            worstPlayers.add(iterator.previous());
            Game.printPlayers(worstPlayers);
            System.out.println("--------------------------------------------------------------------");
        }

    }

}
