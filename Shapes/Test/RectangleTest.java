import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    private Rectangle rectangle;
    private Rectangle rectangle2;

    @BeforeEach
    void setup(){
        rectangle = new Rectangle("#red", true, 2, 3);
        rectangle2 = new Rectangle("#red", true, 6, 8);
//        rectangle = new Rectangle("#red", true, -1, 3);
    }

    @Test
    void getArea() {
        // width * length
        // 2 * 3 = 6
        assertEquals(6, rectangle.getArea());
        assertEquals(48, rectangle2.getArea());
    }

    @Test
    void getPerimeter() {
        // 2 * width + 2 * length
        // 2 * 2 + 2 * 3 = 10
        assertEquals(10, rectangle.getPerimeter());
        assertEquals(28, rectangle2.getPerimeter());
    }
}