import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    private Shape square;

    @BeforeEach
    void setup(){
        square = new Square("#red", false, 4);
    }

    @Test
    void getArea(){
        // width * width
        assertEquals(16, square.getArea());
    }

    @Test
    void getPerimeter(){
        // 4 * width
        assertEquals(16, square.getPerimeter());
    }


}