package crickbuzz.inning;

import java.util.List;

import crickbuzz.Team;
import crickbuzz.player.BattingScoreCard;

public class Inning {
    Team battingTeam;
    Team bowlingTeam;
    List<Over> overs;

    public Inning(Team a, Team b){
        this.battingTeam = a;
        this.battingTeam = b;
    }

    public void startInning(){
        //Let us play 1 over match
        Ball ball1 = new Ball(1, BallType.LEGAL, RunsScored.FOUR, battingTeam.getPlaying11().get(0), bowlingTeam.getPlaying11().get(10));
        Ball ball2 = new Ball(1, BallType.LEGAL, RunsScored.FOUR, battingTeam.getPlaying11().get(0), bowlingTeam.getPlaying11().get(10));
        Ball ball3 = new Ball(1, BallType.LEGAL, RunsScored.FOUR, battingTeam.getPlaying11().get(0), bowlingTeam.getPlaying11().get(10));
        Ball ball4 = new Ball(1, BallType.LEGAL, RunsScored.FOUR, battingTeam.getPlaying11().get(0), bowlingTeam.getPlaying11().get(10));
        Ball ball5 = new Ball(1, BallType.LEGAL, RunsScored.FOUR, battingTeam.getPlaying11().get(0), bowlingTeam.getPlaying11().get(10));
        Ball ball6 = new Ball(1, BallType.LEGAL, RunsScored.FOUR, battingTeam.getPlaying11().get(0), bowlingTeam.getPlaying11().get(10));
        Over over = new Over(1, List.of(ball1, ball2, ball3, ball4, ball5, ball6));
        overs.add(over);
        battingTeam.getPlaying11().get(0).battingScoreCard = new BattingScoreCard();

    }
}
