package TicTacToe;

public class PlayingPiece {
    private PieceType type;
    public PlayingPiece(PieceType t){
        this.type = t;
    }

    public PieceType getPieceType(){
        return this.type;
    }
}
