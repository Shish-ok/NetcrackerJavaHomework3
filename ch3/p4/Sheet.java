package comm.netcracker.homework3.ch3.p4;

public class Sheet {
    private int width;
    private int height;
    private int name;

    public Sheet(int width, int height) {
        this.width = width;
        this.height = height;
        if (width == 841) { name = 0; }
        else if (width == 594) { name = 1; }
        else if (width == 420) { name = 2; }
        else if (width == 297) { name = 3; }
        else if (width == 210) { name = 4; }
        else if (width == 148) { name = 5; }
        else if (width == 105) { name = 6; }
        else if (width == 74) { name = 7; }
        else if (width == 52) { name = 8; }
        else if (width == 37) { name = 9; }
        else { name = 10; }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return "A" + name;
    }

    public void cutInHalf () {
        if (width >= height){ width /= 2; }
        else { height /= 2; }
        ++name;
    }
}
