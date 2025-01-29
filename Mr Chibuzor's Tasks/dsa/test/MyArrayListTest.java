import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest {
    private MyArrayList myArrayList;

    @BeforeEach
    public void setUp() {
        myArrayList = new MyArrayList();
    }

    @Test
    public void testThatArrayListIsEmpty() {
        assertTrue(myArrayList.isEmpty());
    }

    @Test
    public void testElementCanBeAddedToArrayList_arrayListSizeIsOne() {
        myArrayList.add("Onyii");
        assertEquals(1, myArrayList.getSize());
    }
    @Test
    public void testThatFiveElementCanBeAddedToArrayList_arrayListSizeIsFive() {
        myArrayList.add("Onyii");
        myArrayList.add("A");
        myArrayList.add("B");
        myArrayList.add("C");
        myArrayList.add("D");
        assertEquals(5, myArrayList.getSize());

    }
    @Test
    public void testThatArrayListCapacityIsIncreased() {
        myArrayList.add("Onyii");
        myArrayList.add("A");
        myArrayList.add("B");
        myArrayList.add("C");
        myArrayList.add("D");
        assertEquals(5, myArrayList.getSize());
    }
    @Test
    public void testThatArrayListIsFull() {
        myArrayList.add("Onyii");
        myArrayList.add("A");
        myArrayList.add("B");
        myArrayList.add("C");
        assertTrue(myArrayList.isFull());

    }
    @Test
    public void testThatElementCanBeClearedFromArrayList() {
        myArrayList.add("Onyii");
        boolean clear = myArrayList.clear();
        assertTrue(clear);
        assertEquals(0, myArrayList.getSize());
    }
    @Test
    public void testThatElementAtSpecificIndexCanBeRemovedFromArrayList() {
        myArrayList.add("Onyii");
        myArrayList.add("A");
        myArrayList.add("B");
        myArrayList.add("C");
        myArrayList.add("D");
        assertEquals(5, myArrayList.getSize());
        myArrayList.remove(2);
        assertEquals(4, myArrayList.getSize());
    }


    @Test
    public void testThatElementIsPresentInTheArrayList() {
        myArrayList.add("Onyii");
        myArrayList.add("A");
        myArrayList.add("B");
        myArrayList.add("C");
        assertTrue(myArrayList.contains("B"));

    }
}