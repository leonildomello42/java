package application;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;

import static application.UI.printBoard;

public class Program {

    // java application/Program
    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();
        printBoard(chessMatch.getPieces());
    }
}
