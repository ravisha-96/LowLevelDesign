package TicTacToe;

public class Player {
    private String name;
    private PlayingPiece piece;

    public Player(String name, PlayingPiece piece){
        this.name = name;
        this.piece = piece;
    }

    public String getName(){
        return this.name;
    }
}
