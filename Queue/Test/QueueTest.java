import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class QueueTest {

    private Queue<Integer> queue;
    private Queue<Integer> queueExpected;

    @BeforeEach
    void setUp(){
        queue = new Queue<Integer>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
    }

    @Test
    void sizeTest(){
        assertEquals(4,queue.size());
        queue.dequeue(2);
        assertEquals(2,queue.size());
        queue.dequeue();
        assertEquals(1,queue.size());
    }

    @Test
    void enqueueTest(){;
        assertEquals(1,queue.getDllist().seekList(0));
        assertEquals(3,queue.getDllist().seekList(2));
    }

    @Test
    void dequeueTest(){
        assertEquals(2,queue.dequeue());
        assertEquals(4,queue.dequeue());
    }
    @Test
    void dequeueListTest(){
        assertEquals(3,queue.dequeue(2));
        assertNull(queue.dequeue(2));
    }

    @Test
    void printQueueTest() {
        assertEquals("1234", queue.printQueue());
        queue.dequeue(2);
        assertEquals("34", queue.printQueue());
        queue.dequeue(2);
        assertEquals("", queue.printQueue());
    }
}
