package TicTacToe;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> players;

    public Game(){
        this.players = new ArrayList<>();
    }

    public void addPlayers(Player p){
        players.add(p);
    }
}
