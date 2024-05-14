package TicTacToe;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PlayingPiece x = new PlayingPiece(PieceType.X);
        Player playerX = new Player("Ravi", x);

        PlayingPiece o = new PlayingPiece(PieceType.O);
        Player playerY = new Player("Suraj", o);

        Board board = new Board(3);
        board.printCurrentBoardState();

        for(int i = 0; i < (3 * 3); i++){
            if (i % 2 == 0){
                System.out.printf("Player x %s turn: choose the empty position (row and column)", playerX.getName());
            }else {
                System.out.printf("Player y %s turn: choose the empty position (row and column)", playerY.getName());
            }
            
            Scanner in = new Scanner(System.in);
            int r = in.nextInt();
            int c = in.nextInt();
            if (i % 2 == 0){
                board.addPiece(x, r, c);
            } else{
                board.addPiece(o, r, c);
            }
            board.printCurrentBoardState();
        }
    }
}
