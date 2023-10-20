package crickbuzz;

import java.util.List;

import crickbuzz.player.Player;

public class Team {
    String teamName;
    List<Player> playing11;
    List<Player> bench;
    
    Team(String teamName, List<Player> playing11, List<Player> bench){
        this.teamName = teamName;
        this.playing11 = playing11;
        this.bench = bench;
    }

    public void getPlaying11(){
        System.out.println(teamName+ "  Playing 11");
        System.out.println("---------------------------");
        int i=1;
        for(Player player: playing11){
            System.out.println(i++ + ". "+player);
        }
        System.out.println();
    }

     public void getBench(){
        System.out.println(teamName+ "Bench");
        for(Player player: bench){
            System.out.println(player);
        }
    }
}
