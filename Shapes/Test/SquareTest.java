import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    private Shape square;
    private Shape square2;

    @BeforeEach
    void setup() {
        square = new Square("#red", false, 4);
        square2 = new Square("#brown", true, 9);
    }

    @Test
    void getArea() {
        // width * width
        assertEquals(16, square.getArea());
        assertEquals(81, square2.getArea());
    }

    @Test
    void getPerimeter() {
        // 4 * width
        assertEquals(16, square.getPerimeter());
        assertEquals(36, square2.getPerimeter());
    }


}