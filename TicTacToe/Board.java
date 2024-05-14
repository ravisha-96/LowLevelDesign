package TicTacToe;

import java.util.Arrays;

public class Board {
    int size;
    PlayingPiece[][] board;
    public Board(int size){
        this.size = size;
        board = new PlayingPiece[size][size];
        for(int i = 0; i < size; i++) {
            Arrays.fill(board[i], new PlayingPiece(PieceType.E));
        }
    }

    public void addPiece(PlayingPiece t, int row, int col) {
        board[row][col] = t;
    }

    public void printCurrentBoardState(){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.print(board[i][j].getPieceType() + " ");
            }
            System.out.println();
        }
    }
}
