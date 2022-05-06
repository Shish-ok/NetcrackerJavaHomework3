package comm.netcracker.homework3.ch9.p1;

import java.util.ArrayList;

public class King implements ChessPiece{
    private int row, column;
    private String coordinates;
    private final String color;

    private final static int[][] steps = {
            { -1, -1 },
            { -1, 0 },
            { -1, 1 },
            { 0, 1 },
            { 1, 1 },
            { 1, 0 },
            { 1, -1},
            { 0, -1},
    };

    public King(String coordinates, String color) {
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

        for (int i = 0; i < 8; ++i) {
            if (0 < row + steps[i][0] && row + steps[i][0] < 9 && -1 < column + steps[i][1] && column + steps[i][1] < 8) {
                moves.add(Character.toString(column + steps[i][1] + 97) + Character.toString(row + steps[i][0] + 48));
            }
        }

        return moves;
    }
}
