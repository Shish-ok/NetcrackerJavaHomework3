package comm.netcracker.homework3.ch9.p1;

import java.util.ArrayList;

public class Pawn implements ChessPiece {
    private int row, column;
    private String coordinates;
    private final String color;

    public Pawn(String coordinates, String color) {
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
        if (row == 8 && color.equals("black") || row == 1 && color.equals("white")) { moves.add("No moves"); }
        else if (color.equals("black")) { moves.add(Character.toString(column + 97) + Character.toString(row + 49)); }
        else { moves.add(Character.toString(column + 97) + Character.toString(row + 47)); }
        return moves;
    }
}
