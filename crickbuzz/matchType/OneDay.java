package crickbuzz.matchType;

public class OneDay implements MatchType{
    public int numberOfOvers(){
        return 50;
    }

    public int maxOverAllowedPerBowler(){
        return 10;
    }
}
