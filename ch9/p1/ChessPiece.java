package comm.netcracker.homework3.ch9.p1;

import java.util.ArrayList;

public interface ChessPiece {
    public void setPosition(String coordinates);
    public String getPosition();
    public ArrayList<String> canMoveTo();
}
