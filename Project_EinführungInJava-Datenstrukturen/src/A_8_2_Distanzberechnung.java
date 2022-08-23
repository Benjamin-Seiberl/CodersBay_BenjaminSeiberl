public class A_8_2_Distanzberechnung {
    public static void main(String[] args) {
        Point point1 = new Point(2, 3);
        Point point2 = new Point(1, 1);
        System.out.printf(" %.2f ", calculateDistance(point1, point2));
    }

    public static double calculateDistance(Point point1, Point point2) {
        int diffX = Math.abs(point1.getX() - point2.getX());
        int diffY = Math.abs(point1.getY() - point2.getY());
        return Math.sqrt(Math.pow(diffX, 2) + Math.pow(diffY, 2));
    }
}
