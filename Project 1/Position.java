public class Position {
    private int x, y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }
    
    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean equals(Position p) {
        if (x == p.getX() && y == p.getY())
            return true;
        else
            return false;
    }

    public String toString(){
        return String.format("(%d,%d)", x, y);
    }
}
