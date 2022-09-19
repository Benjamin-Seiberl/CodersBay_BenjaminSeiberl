import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    private Circle circle;

    @BeforeEach
    void setup() {
        circle = new Circle("#red", true, 2);
    }

    @Test
    void getAreaTest() {
        // radius^2 * Pi
        assertEquals(12.566370614359172953850573533118, circle.getArea());
        circle.setRadius(4);
        assertEquals(50.265482457436691815402294132472, circle.getArea());
    }

    @Test
    void getPerimeterTest() {
        // 2 * radius * Pi
        assertEquals(12.566370614359172953850573533118, circle.getPerimeter());
        circle.setRadius(4);
        assertEquals(25.132741228718345907701147066236, circle.getPerimeter());
    }

//    @Test
//    void exceptionTest(){
//        IllegalArgumentException thrown = assertThrows((IllegalArgumentException.class, () -> new Circle("#red", true, -2), "");
//        assertTrue(thrown.getMessage().contains("Argument"));
//    }
}