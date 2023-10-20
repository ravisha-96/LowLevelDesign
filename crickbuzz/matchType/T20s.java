package crickbuzz.matchType;

public class T20s implements MatchType{
    public int numberOfOvers(){
        return 20;
    }

    public int maxOverAllowedPerBowler(){
        return 4;
    }
}
