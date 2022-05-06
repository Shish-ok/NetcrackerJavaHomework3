package comm.netcracker.homework3.ch9.p1;

import java.util.ArrayList;

public class Bishop implements ChessPiece{
    private int row, column;
    private String coordinates;
    private final String color;

    public Bishop(String coordinates, String color) {
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
        int[][] directions = {
                { row - 1, column - 1 },
                { row - 1, column + 1 },
                { row + 1, column + 1 },
                { row + 1, column - 1 },
        };

        while (0 < directions[0][0] && directions[0][1] > -1) {
            moves.add(Character.toString(directions[0][1] + 97) + Character.toString(directions[0][0] + 48));
            --directions[0][0];
            --directions[0][1];
        }

        while (0 < directions[1][0] && directions[1][1] < 8) {
            moves.add(Character.toString(directions[1][1] + 97) + Character.toString(directions[1][0] + 48));
            --directions[1][0];
            ++directions[1][1];
        }

        while (directions[2][0] < 9 && directions[2][1] < 8) {
            moves.add(Character.toString(directions[2][1] + 97) + Character.toString(directions[2][0] + 48));
            ++directions[2][0];
            ++directions[2][1];
        }

        while (directions[3][0] < 9 && directions[3][1] > - 1) {
            moves.add(Character.toString(directions[3][1] + 97) + Character.toString(directions[3][0] + 48));
            ++directions[3][0];
            --directions[3][1];
        }

        return moves;
    }
}
