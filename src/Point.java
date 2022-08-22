public class Point {
    private int x;
    private int y;

    public void setX(int radius, int angle) {
        if (x >= 0) {
            this.x = (int) (radius * Math.cos(angle));
        }
    }

    public void setY(int radius, int angle) {
        if (y >= 0) {
            this.y = (int) (radius * Math.sin(angle));
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point(int x, int y) {
        if (x >= 0 && y >= 0) {
            this.x = x;
            this.y = y;
        }
    }
}
