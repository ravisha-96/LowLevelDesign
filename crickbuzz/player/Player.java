package crickbuzz.player;

public class Player {
    Person person;
    PlayerType playerType;
    BattingScoreCard battingScoreCard;
    BowlingScoreCard BowlingScoreCard;

    public Player(Person person, PlayerType pType){
        this.person = person;
        this.playerType = pType;
    }

    public String toString(){
        return person.name +"  " +playerType;
    }
}
