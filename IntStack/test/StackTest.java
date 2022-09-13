import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    private Stack<Integer> stack;

    @BeforeEach
    void setUp() {
        stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
    }

    @Test
    void sizeTest() {
        assertEquals(4, stack.size());
        stack.push(5);
        assertEquals(5, stack.size());
        stack.pop();
        assertEquals(4, stack.size());
        stack.pop(3);
        assertEquals(1, stack.size());
        stack.pop();
        assertEquals(0, stack.size());

        //stack already 0
        stack.pop(3);
        assertEquals(0, stack.size());
    }

    @Test
    void pushTest() {

        assertEquals(4, stack.peek());
        stack.push(5);
        assertEquals(5, stack.peek());
        stack.push(6);
        assertEquals(6, stack.peek());

        //push if stack is empty
        stack.pop(6);
        stack.push(1);
        assertEquals(1, stack.peek());
    }

    @Test
    void popTest() {
        assertEquals(4, stack.pop());
        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());

        //pop to many elements
        assertEquals(null, stack.pop());
    }

    @Test
    void popListTest() {
        Integer[] expected = {4, 3};
        assertArrayEquals(expected, stack.pop(2));
        Integer[] expected2 = new Integer[3];

        //pop too many elements
        assertNull(stack.pop(3));
    }

    @Test
    void peekTest() {
        assertEquals(4, stack.peek());
        stack.push(5);
        assertEquals(5, stack.peek());
        stack.pop(3);
        assertEquals(2, stack.peek());

        //peek if there are no elements
        stack.pop(2);
        assertNull(stack.peek());
    }

    @Test
    void printStackTest() {
        assertEquals("1234", stack.printStack());
        stack.pop(2);
        assertEquals("12", stack.printStack());
        stack.pop(2);
        assertEquals("", stack.printStack());
    }
}
