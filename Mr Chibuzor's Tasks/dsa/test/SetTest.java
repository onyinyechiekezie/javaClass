import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SetTest {
    MyArrayList myList;

    @BeforeEach
    public void setUp() {
        myList = new MyArrayList();
    }
    @Test
    public void testThatSetIsEmpty() {
        assertTrue(myList.isEmpty());
    }
    @Test
    public void testThatElementCanBeAddedToSet() {
        myList.add("onyii");
        assertEquals(1, myList.getSize());
    }

    @Test
    public void testThatElementAtASpecificIndexCanBeRemovedFromSet() {
        myList.add("onyii");
        myList.add("Ada");
        myList.add("Autumn");
        myList.remove(1);
        assertEquals(2, myList.getSize());
    }
    @Test
    public void testThatDuplicateElementsCannotBeAddedToSetList() {
        myList.add("Lemons");
        myList.add("Mango");
        myList.add("Lemons");
        myList.add("Banana");
        myList.remove(2);
        assertEquals(3, myList.getSize());
    }

}