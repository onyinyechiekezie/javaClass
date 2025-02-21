import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import MyDiary.MyDiary;
import Entry.Entry;

public class MyDiaryTest {
    MyDiary myDiary;

    @BeforeEach
    public void setUp() {
        myDiary = new MyDiary("user", "password");
    }

    @Test
    public void testThatMyDiaryExists() {
        assertTrue(myDiary.isExist());
    }

    @Test
    public void testThatMyDiaryIsEmpty() {
        assertTrue(myDiary.isEmpty());
    }

    @Test
    public void testThatIncorrectPasswordDoesNotUnlockDiary() {
        String incorrectPassword = "wrongpassword";
        assertThrows(IllegalArgumentException.class, () -> myDiary.unlockDiary(incorrectPassword));
    }

    @Test
    public void testThatCorrectPasswordUnlocksDiary() {
        String correctPassword = "password";
        myDiary.unlockDiary(correctPassword);
        assertFalse(myDiary.isDiaryLocked);
    }

    @Test
    public void testThatDiaryIsLocked() {
        myDiary.lockDiary();
        assertTrue(myDiary.isDiaryLocked);
    }

    @Test
    public void testCreateEntryMethod_WhenDiaryIsLocked() {
        myDiary.lockDiary();
        assertTrue(myDiary.isDiaryLocked);
        //myDiary.lockDiary();
        //assertFalse(myDiary.isDiaryLocked);
        myDiary.createEntry("My Entry", "I created a diary");
        assertTrue(myDiary.isDiaryLocked);
    }

    @Test
    public void testCreateEntryMethod_WhenDiaryIsUnlocked() {
        myDiary.unlockDiary("password");
        assertFalse(myDiary.isDiaryLocked);
        myDiary.createEntry("My Entry", "I created a diary");
        assertEquals(1, myDiary.entries.size());
        assertEquals("My Entry", myDiary.entries.get(0).getTitle());
        assertEquals("I created a diary", myDiary.entries.get(0).getBody());
    }

    @Test
    public void testThatDiaryCanCreateMultipleEntries() {
        myDiary.unlockDiary("password");
        assertFalse(myDiary.isDiaryLocked);
        myDiary.createEntry("My First Entry", "I created a diary.");
        myDiary.createEntry("My Second Entry", "It's exciting.");
        assertEquals(2, myDiary.entries.size());
        assertEquals("My First Entry", myDiary.entries.get(0).getTitle());
        assertEquals("I created a diary.", myDiary.entries.get(0).getBody());
        assertEquals("My Second Entry", myDiary.entries.get(1).getTitle());
        assertEquals("It's exciting.", myDiary.entries.get(1).getBody());
    }

    @Test
    public void test_FindEntryById() {
        myDiary.unlockDiary("password");
        assertFalse(myDiary.isDiaryLocked);
        myDiary.createEntry("My Entry", "I created a diary.");
        myDiary.createEntry("My Second Entry", "It's exciting.");
        Entry foundEntry = myDiary.findEntryById(1);
        assertEquals("My Entry", foundEntry.getTitle());
    }

    @Test
    public void test_DeleteEntryById() {
        myDiary.unlockDiary("password");
        assertFalse(myDiary.isDiaryLocked);
        myDiary.createEntry("My Entry", "I created a diary.");
        myDiary.createEntry("My Second Entry", "It's exciting.");
        myDiary.deleteEntry(1);
        assertEquals(1, myDiary.entries.size());
    }

    @Test
    public void test_UpdateEntry() {
        myDiary.unlockDiary("password");
        assertFalse(myDiary.isDiaryLocked);
        myDiary.createEntry("My Entry", "I created a diary.");
        myDiary.updateEntry(1, "My Entry", "I created a diary updated.");
        assertEquals(1, myDiary.entries.size());

    }

}







//
//    @Test
//    void testCreateEntry_WithCorrectPassword_AssignsCorrectEntryId() {
//        // Given the diary is unlocked
//        myDiary.unlockDiary("password123");
//
//        // When creating multiple entries
//        myDiary.createEntry("Entry 1", "Content 1");
//        myDiary.createEntry("Entry 2", "Content 2");
//
//        // Then the entries should have consecutive IDs starting from 1
//        assertEquals(1, myDiary.entries.get(0).getId(), "The first entry should have ID 1.");
//        assertEquals(2, myDiary.entries.get(1).getId(), "The second entry should have ID 2.");
//    }
//}

//    @Test
//    void testIsExist_WhenDiaryHasEntries_ReturnsTrue() {
//        // Given that the diary has entries
//        MyDiary.Entry entry1 = new MyDiary.Entry("First Entry", "This is my first diary entry.");
//        myDiary.addEntry(entry1);
//
//        // When calling isExist
//        boolean result = myDiary.isExist();
//
//        // Then it should return true
//        assertTrue(result);
//    }



//    @Test
//    public void testCreateDiaryUser(){
//        myDiary.userName = " ";
//        myDiary.password = " ";
//        myDiary.confirmPassword = " ";
//        boolean
//        assertEquals("userName", "password", "confirmPassword", myDiary.createDiaryUser("onyi","1234", "1234"));
//    }

//    @Test
//    public void testThatUserHasUserNameAndPassword() {
//        myDiary.userName = " ";
//        myDiary.password = " ";
//        assertTrue(myDiary.loginDetails());
//    }






