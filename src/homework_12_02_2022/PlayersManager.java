package homework_12_02_2022;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PlayersManager {
    private List<Player> allPlayers;
    static PlayersManager pm = null;
    public static PlayersManager getInstance() {
        if (pm == null);
        pm = new PlayersManager();
        return pm;
    }

    private PlayersManager() {
        allPlayers = new ArrayList<Player>();
    }

    public boolean addPlayer(Player player) {
        for (Player player1 : allPlayers) {
            if (player.getId().equals(player1.getId()))
                return false;
        }
        if (assignLeague(player))
            allPlayers.add(player);
        return true;
    }

    public boolean assignLeague(Player player) {
        boolean res = true;
        if (player.getAge() >= 15 && player.getAge() <= 20)
            player.setLeague(League.SECOND);
        else if (player.getAge() >= 21 && player.getAge() <= 30)
            player.setLeague(League.FIRST);
        else if (player.getAge() > 31 && player.getAge() <= 40)
            player.setLeague(League.PRIME);
        else res = false;
        return res;
    }

    public List<Player> getAllPlayersByleague(League league) {
        List<Player> playerList = new LinkedList<>();
        for (Player player : allPlayers) {
            if (player.getLeague().equals(league))
                playerList.add(player);
        }
        return playerList;
    }
}
