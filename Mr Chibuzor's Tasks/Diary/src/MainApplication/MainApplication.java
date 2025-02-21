package MainApplication;

import javax.swing.*;
import Diaries.Diaries;
import Entry.Entry;
import MyDiary.MyDiary;

public class MainApplication {
    private Diaries diaries = new Diaries();

    public static void main(String[] args) {
        MainApplication app = new MainApplication();
        app.runApp();
    }
    public void runApp() {

        int option = 0;
        while(option != 9) {
            String input = JOptionPane.showInputDialog(null, """
                Welcome To Your Digital Diary. Write, Reflect and Grow With Us.
                Kindly choose an option:
                1. Create Diary
                2. Lock Diary
                3. Unlock Diary
                4. Create Entry
                5. Delete Entry
                6. Update Entry
                7. View Entry
                8. Delete Diary
                9. Exit
                """);

            try {
                option = Integer.parseInt(input);
                switch (option) {
                    case 1:
                        createDiary();
                        break;
                    case 2:
                        lockDiary();
                        break;
                    case 3:
                        unlockDiary();
                        break;
                    case 4:
                        createEntry();
                        break;
                    case 5:
                        deleteEntry();
                        break;
                    case 6:
                        updateEntry();
                        break;
                    case 7:
                        viewEntry();
                        break;
//                    case 8:
//                        deleteDiary();
//                        break;
                    case 9:
                        JOptionPane.showMessageDialog(null, "Thanks for using Onyii's diary");
                        System.exit(0);
                        break;
                    default:
                        break;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid number.");
            }
        }
    }

    public void createDiary() {
        String userName = JOptionPane.showInputDialog("Enter your Username");
        String password = JOptionPane.showInputDialog("Enter your Password");
        Diaries diaries = new Diaries();
        diaries.add(userName, password);
        JOptionPane.showMessageDialog(null, "Diary created");
    }

    private void lockDiary() {
        MyDiary diary = new MyDiary();
        diary.lockDiary();
        JOptionPane.showMessageDialog(null, "Diary is locked");
    }

    private void unlockDiary() {
        MyDiary diary = new MyDiary();
        String password = JOptionPane.showInputDialog("Enter your Password");
        diary.unlockDiary(password);
        JOptionPane.showMessageDialog(null, "Diary is unlocked");
    }

    private void createEntry() {
        MyDiary diary = new MyDiary();
        if(diary.isLocked()) {
            JOptionPane.showMessageDialog(null, "Diary is locked");
        }
        String title = JOptionPane.showInputDialog("Enter your title");
        String body = JOptionPane.showInputDialog("Enter your content");
        diary.createEntry(title, body);
        JOptionPane.showMessageDialog(null, "New entry added");
    }

    private void deleteEntry() {
        MyDiary diary = new MyDiary();
        int entryId = Integer.parseInt(JOptionPane.showInputDialog("Enter your entry ID"));
        diary.deleteEntry(entryId);
        JOptionPane.showMessageDialog(null, "Entry with ID " + entryId + " deleted.");
    }

    private void updateEntry() {
        MyDiary diary = new MyDiary();
        int entryId = Integer.parseInt(JOptionPane.showInputDialog("Enter your entry ID"));
        String title = JOptionPane.showInputDialog("Update your title");
        String body = JOptionPane.showInputDialog("Update your content");
        diary.updateEntry(entryId, title, body);
        JOptionPane.showMessageDialog(null, "Entry updated");
    }

    private void viewEntry() {}


}
