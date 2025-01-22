import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest {
    @Test
    public void testThatArrayListIsEmpty() {
        MyArrayList myArrayList = new MyArrayList();
        assertTrue(myArrayList.isEmpty());
    }

    @Test
    public void testElementCanBeAddedToArrayList_arrayListSizeIsOne() {
        MyArrayList myArrayList = new MyArrayList( 2);
        myArrayList.add("Onyii");
        assertEquals(1, myArrayList.getSize());
    }
    @Test
    public void testThatFiveElementCanBeAddedToArrayList_arrayListSizeIsFive() {
        MyArrayList myArrayList = new MyArrayList( 5);
        myArrayList.add("Onyii");
        myArrayList.add("A");
        myArrayList.add("B");
        myArrayList.add("C");
        myArrayList.add("D");
        assertEquals(5, myArrayList.getSize());

    }
    @Test
    public void testThatElementCanBeClearedFromArrayList() {
        MyArrayList myArrayList = new MyArrayList( 5);
        myArrayList.add("Onyii");
        boolean clear = myArrayList.clear();
        assertTrue(clear);
        assertEquals(0, myArrayList.getSize());
    }
    @Test
    public void testThatElementAtSpecificIndexCanBeRemovedFromArrayList() {
        MyArrayList myArrayList = new MyArrayList( 5);
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
    public void testThatReplacesAnElementAtASpecificIndexFromArrayList() {
        MyArrayList myArrayList = new MyArrayList( 5);
        myArrayList.add("Onyii");
        myArrayList.add("A");
        myArrayList.add("B");
        assertEquals(3, myArrayList.getSize());
        String setValue = myArrayList.set(1, "X");
        assertEquals("X", setValue.toString());
    }
}