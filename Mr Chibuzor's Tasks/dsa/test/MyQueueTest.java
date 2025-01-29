import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyQueueTest {
    private MyQueue myQueue;

    @BeforeEach
    public void setUp() {
        myQueue = new MyQueue();
    }

    @Test
    public void testThatQueueIsEmpty() {
        assertTrue(myQueue.isEmpty());

    }

    @Test
    public void testThatElementCanBeAddedToQueue() {
        myQueue.enqueue("A");
        myQueue.enqueue("B");
        myQueue.enqueue("C");
        assertEquals(3, myQueue.getSize());

    }

    @Test
    public void testThatElementCanBeRemovedFromQueue() {
        myQueue.enqueue("A");
        myQueue.enqueue("B");
        myQueue.enqueue("C");
        assertEquals(3, myQueue.getSize());
        String removedElement = myQueue.dequeue();
        assertEquals("A", removedElement);
        assertEquals(2, myQueue.getSize());
    }

}


