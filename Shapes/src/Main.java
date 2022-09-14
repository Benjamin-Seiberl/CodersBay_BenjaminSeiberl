
public class Main {

    public static void main(String[] args) {

        System.out.println("Circles: ");
        print(createCircle("#red", true, 2));
        print(createCircle("#brown", false, 5));
        print(createCircle("#red", true, -2));

        System.out.println("Rectangles: ");
        print(createRectangle("#red", false, 2, 3));
        print(createRectangle("#yellow", true, 4, 2));
        print(createRectangle("#white", false, 0, 3));

        System.out.println("Squares: ");
        print(createSquare("#red", true, 2));
        print(createSquare("#brown", false, 8));
        print(createSquare("#black", true, 12));
    }

    public static Shape createCircle(String color, boolean isFilled, double radius) {
        Shape circle;
        try {
            circle = new Circle(color, isFilled, radius);
        } catch (IllegalArgumentException i) {
            System.out.println("Circle " + Circle.COUNTER__ + " had wrong inputs!");
            System.out.println("Radius requires a positiv number: ");
            radius = UserInput.getDouble(1, "Number must be positiv!");
            circle = new Circle(color, isFilled, radius);
        }
        return circle;
    }

    public static Shape createRectangle(String color, boolean isFilled, double width, double length) {
        Shape rectangle;
        try {
            rectangle = new Rectangle(color, isFilled, width, length);
        } catch (IllegalArgumentException i) {
            System.out.println("Rectangle " + Rectangle.COUNTER__ + " had wrong inputs!");
            System.out.println("Width requires a positiv number: ");
            width = UserInput.getDouble(1, "Number must be positiv!");
            System.out.println("Length requires a positiv number: ");
            length = UserInput.getDouble(1, "Number must be positiv!");
            rectangle = new Rectangle(color, isFilled, width, length);
        }
        return rectangle;
    }

    public static Shape createSquare(String color, boolean isFilled, double width) {
        Shape square;
        try {
            square = new Square(color, isFilled, width);
        } catch (IllegalArgumentException i) {
            System.out.println("Square " + Square.COUNTER__ + " had wrong inputs!");
            System.out.println("Width requires a positiv number: ");
            width = UserInput.getDouble(1, "Number must be positiv!");
            square = new Square(color, isFilled, width);
        }
        return square;
    }

    public static void print(Shape s){;
        System.out.println("Area: " + s.getArea());
        System.out.println("Perimeter: " + s.getPerimeter());
        System.out.println();
    }
}

