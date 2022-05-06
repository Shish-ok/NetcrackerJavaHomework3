package comm.netcracker.homework3.ch9.p1;

import java.util.ArrayList;

public class Rook implements ChessPiece {
    private int row, column;
    private String coordinates;
    private final String color;

    public Rook(String coordinates, String color) {
        this.coordinates = coordinates;
        this.color = color;
        column = coordinates.charAt(0) - 97;
        row = coordinates.charAt(1) - 48;
    }

    public void setPosition(String coordinates) {
        this.coordinates = coordinates;
        column = coordinates.charAt(0) - 97;
        row = coordinates.charAt(1) - 48;
    }

    public String getPosition() { return coordinates; }

    public ArrayList<String> canMoveTo() {
        ArrayList<String> moves = new ArrayList<>();
        int left = column - 1, up = row - 1, right = column + 1, down = row + 1;

        while (left > -1) {
            moves.add(Character.toString(left + 97) + Character.toString(row + 48));
            --left;
        }

        while (up > 0) {
            moves.add(Character.toString(column + 97) + Character.toString(up + 48));
            --up;
        }

        while (right < 8) {
            moves.add(Character.toString(right + 97) + Character.toString(row + 48));
            ++right;
        }

        while (down < 9) {
            moves.add(Character.toString(column + 97) + Character.toString(down + 48));
            ++down;
        }

        return moves;
    }
}
