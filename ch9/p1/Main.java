package comm.netcracker.homework3.ch9.p1;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] parameters;
        Scanner in = new Scanner(System.in);
        ChessPiece figure;

        while(true) {
            System.out.print("Enter the shape type, color and position separated by a space: ");
            parameters = in.nextLine().split(" ");
            switch (parameters[0]) {
                case "Pawn", "pawn":
                    figure = new Pawn(parameters[2], parameters[1]);
                    break;
                case "Knight", "knight":
                    figure = new Knight(parameters[2], parameters[1]);
                    break;
                case "Bishop", "bishop":
                    figure = new Bishop(parameters[2], parameters[1]);
                    break;
                case "Rook", "rook":
                    figure = new Rook(parameters[2], parameters[1]);
                    break;
                case "Queen", "queen":
                    figure = new Queen(parameters[2], parameters[1]);
                    break;
                default:
                    figure = new King(parameters[2], parameters[1]);
            }
            displayMoves(figure.canMoveTo(), figure.getPosition());
        }
    }

    public static void displayMoves(ArrayList<String> moves, String figureCoordinate) {
        if (moves.get(0).equals("No moves")) { System.out.println("No moves"); }
        else {
            int row, column;
            String[][] chessBoard = {
                    {" ", " a", " b", " c", " d", " e", " f", " g", " h"},
                    {"1", " 0", " 1", " 0", " 1", " 0", " 1", " 0", " 1"},
                    {"2", " 1", " 0", " 1", " 0", " 1", " 0", " 1", " 0"},
                    {"3", " 0", " 1", " 0", " 1", " 0", " 1", " 0", " 1"},
                    {"4", " 1", " 0", " 1", " 0", " 1", " 0", " 1", " 0"},
                    {"5", " 0", " 1", " 0", " 1", " 0", " 1", " 0", " 1"},
                    {"6", " 1", " 0", " 1", " 0", " 1", " 0", " 1", " 0"},
                    {"7", " 0", " 1", " 0", " 1", " 0", " 1", " 0", " 1"},
                    {"8", " 1", " 0", " 1", " 0", " 1", " 0", " 1", " 0"},
            };

            row = figureCoordinate.charAt(1) - 48;
            column = figureCoordinate.charAt(0) - 96;
            chessBoard[row][column] = " X";
            System.out.print("Possible moves: ");
            moves.forEach(position -> System.out.print(position + " "));
            for (String position : moves) {
                row = position.charAt(1) - 48;
                column = position.charAt(0) - 96;
                chessBoard[row][column] = " #";
            }
            System.out.println();
            for (int i = 0; i < 9; ++i) {
                for (int j = 0; j < 9; ++j) {
                    System.out.print(chessBoard[i][j]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
