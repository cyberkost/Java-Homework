package gameLeague;

import java.util.*;

public class PlayersManager {
    private Map<League, List<Player>> mapOfPlayers;
    private Set<UUID> uuids;
    static PlayersManager pm = null;

    private PlayersManager() {
        mapOfPlayers = new HashMap<>();
        uuids = new HashSet<>();
        for (League l : League.values()) {
            mapOfPlayers.put(l, new ArrayList<>());
        }
    }

    public static PlayersManager getInstance() {
        if (pm == null)
            pm = new PlayersManager();
        return pm;
    }

    public boolean addPlayer(Player player) {
        Boolean res = false;
        if (!uuids.contains(player.getId())) {
            League league = assignLeague(player);
            if (league != League.INDEFINITE) {
                List<Player> players = mapOfPlayers.get(league);
                players.add(player);
                uuids.add(player.getId());
                res = true;
            }
        }
        return res;
    }

    public League assignLeague(Player player) {
        League res = League.INDEFINITE;
        if (player.getAge() >= 15 && player.getAge() <= 20) {
            player.setLeague(League.SECOND);
            res = League.SECOND;
        } else if (player.getAge() >= 21 && player.getAge() <= 30) {
            player.setLeague(League.FIRST);
            res = League.FIRST;
        } else if (player.getAge() >= 31 && player.getAge() <= 40) {
            player.setLeague(League.PRIME);
            res = League.PRIME;
        }
        return res;
    }

    public List<Player> getAllPlayersByleague(League league) {
        return new LinkedList<>(mapOfPlayers.get(league));
    }

    public boolean changeLeague(Player player, League newLeague) {
        boolean res = false;
        if (player.getLeague().equals(newLeague)) {
            List<Player> playersOldLeague = mapOfPlayers.get(player.getLeague());
            List<Player> playersNewLeague = mapOfPlayers.get(newLeague);
            Iterator<Player> it = playersOldLeague.iterator();
            while (it.hasNext() && !res) {
                Player p = it.next();
                if (p.getId().equals(player.getId())) {
                    it.remove();
                    playersNewLeague.add(player);
                    res = true;
                }
            }
        }
        return res;
    }
}
