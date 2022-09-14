public class Square extends Rectangle{
    static int COUNTER__ = 1;
    public Square(String color, boolean isFilled, double width) {
        super(color, isFilled, width, width);
        COUNTER__++;
    }

}
