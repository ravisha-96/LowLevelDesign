package crickbuzz.inning;

import java.util.List;

public class Over {
    int overNumber;
    List<Ball> balls;

    public Over(int overNumber, List<Ball> balls){
        this.overNumber = overNumber;
        this.balls = balls;
    }
}
