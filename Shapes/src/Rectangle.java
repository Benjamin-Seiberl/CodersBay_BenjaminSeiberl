public class Rectangle extends Shape{
    private double width;
    private double length;
    static int COUNTER__ = 1;

    public Rectangle(String color, boolean isFilled, double width, double length) {
        super(color, isFilled);
        if(width <= 0 || length <= 0){
            throw new IllegalArgumentException();
        }
        this.width = width;
        this.length = length;
        COUNTER__++;

    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return 2*width + 2*length;
    }
}
