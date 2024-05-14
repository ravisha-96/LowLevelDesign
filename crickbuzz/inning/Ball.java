package crickbuzz.inning;

import crickbuzz.player.Player;

public class Ball {
    int ballNo;
    BallType ballType;
    RunsScored runs;
    Player striker;
    Player bowler;

    Ball(int ballNo, BallType ballType, RunsScored runs, Player striker, Player bowler){
        this.ballNo = ballNo;
        this.ballType = ballType;
        this.runs = runs;
        this.striker = striker;
        this.bowler = bowler;
    }
}
