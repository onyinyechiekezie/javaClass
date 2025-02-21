package MyDiary;

import Entry.Entry;
import java.util.ArrayList;

public class MyDiary {
    private boolean isDiaryExist = true;
    private boolean isEmptyDiary = true;
    private String userName;
    private String password;
    public boolean isDiaryLocked;
    public int entryId = 1;
    public ArrayList<Entry> entries = new ArrayList<>();

    public MyDiary() {

    }

    public String getUserName() {
        return userName;
    }

    public MyDiary(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.isDiaryLocked = false;
    }

    public boolean isExist() {
        return isDiaryExist;
    }

    public boolean isLocked() {
        return isDiaryLocked;
    }

    public boolean isEmpty() {
        if (isEmptyDiary) ;
        return true;
    }

    public void unlockDiary(String password) {
        if (this.password.equals(password)) {
            this.isDiaryLocked = false;
        } else {
            throw new IllegalArgumentException("Incorrect password. Try Again!");
        }
    }

    public void lockDiary() {
        this.isDiaryLocked = true;
    }

    public void createEntry(String title, String body) {
        Entry entry = new Entry(entryId++, title, body);
        entries.add(entry);
    }

    public void deleteEntry(int entryId) {
        Entry entryToDelete = findEntryById(entryId);
        if (entryToDelete != null)
            entries.remove(entryToDelete);

    }

    public Entry findEntryById(int entryId) {
        for (Entry entry : entries) {
            if (entry.getId() == entryId) {
                return entry;
            }
        }
        return null;
    }

    public void updateEntry(int entryId, String title, String body) {
        Entry entryToUpdate = findEntryById(entryId);
        if (entryToUpdate != null) {
            entryToUpdate.setTitle(title);
            entryToUpdate.setBody(body);
        }
    }

    public String viewEntry(int entryId) {
        Entry entry = findEntryById(entryId);
        if (entry != null) {
            return entry.toString();
        }
        return null;
    }




//    public void addEntry(Entry entry) {
//        entries.add(entry);
//        System.out.println("Entry added.");
//    }
}




//public void createEntry(String title, String body) {
//    if (this.isDiaryLocked) {
//        System.out.println("Diary is locked.");
//        return;
//    }
//    Entry entry = new Entry(entryId++, title, body);
//    entries.add(entry);
//    System.out.println("New entry added with ID: " + entry.getId());
//}
//    // Delete a diary entry by ID
//    public void deleteEntry(int entryId) {
//        if (this.isLocked) {
//            System.out.println("Diary is locked. Please unlock it to delete an entry.");
//            return;
//        }
//        Entry entryToRemove = findEntryById(entryId);
//        if (entryToRemove != null) {
//            entries.remove(entryToRemove);
//            System.out.println("Entry with ID " + entryId + " deleted.");
//        } else {
//            System.out.println("Entry with ID " + entryId + " not found.");
//        }
//    }
//
//    // Find an entry by its ID
//    public Entry findEntryById(int entryId) {
//        for (Entry entry : entries) {
//            if (entry.getId() == entryId) {
//                return entry;
//            }
//        }
//        System.out.println("Entry with ID " + entryId + " not found.");
//        return null;
//    }
//
//    // Update an entry by ID
//    public void updateEntry(int entryId, String newTitle, String newContent) {
//        if (this.isLocked) {
//            System.out.println("Diary is locked. Please unlock it to update an entry.");
//            return;
//        }
//        Entry entryToUpdate = findEntryById(entryId);
//        if (entryToUpdate != null) {
//            entryToUpdate.setTitle(newTitle);
//            entryToUpdate.setContent(newContent);
//            System.out.println("Entry with ID " + entryId + " updated.");
//        } else {
//            System.out.println("Entry with ID " + entryId + " not found.");
//        }
//    }
//}
