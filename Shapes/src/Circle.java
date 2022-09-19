public class Circle extends Shape {
    private double radius;
    static int COUNTER__ = 1;


    public Circle(String color, boolean isFilled, double radius) throws IllegalArgumentException {
        super(color, isFilled);
        if (radius <= 0) {
            throw new IllegalArgumentException("Hallo");
        }
        this.radius = radius;
        COUNTER__++;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException();
        } else {
            this.radius = radius;
        }
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
}
