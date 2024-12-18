import java.util.HashMap;
import java.util.Map;

public class Arena {
    private Map<String, Player> players = new HashMap<>();

    public void addPlayer(Player player) {
        players.put(player.getName(), player);
        player.setArena(this);
        notifyPlayers(player);
    }

    public void notifyPlayers(Player initiator) {
        String message = initiator.getName() + " заходить на арену!";
        for (Player player : players.values()) {
            if (!player.equals(initiator)) {
                player.receiveMessage(message);
            }
        }
    }

    public void movePlayer(Player player, String direction) {
        player.move(direction);
    }

    public void attack(Player attacker, Player target) {
        attacker.attackTarget(target);
    }
}
