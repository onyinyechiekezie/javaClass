package Diaries;

import java.util.ArrayList;
import java.util.Objects;

import MyDiary.MyDiary;

public class Diaries {
    public ArrayList<MyDiary> diaries = new ArrayList<>();

    public void createDiary(String userName, String password) {}

    public void add(String username, String password) {
        MyDiary diary = new MyDiary(username, password);
        diaries.add(diary);
    }

    public MyDiary findByUsername(String username) {
        for(MyDiary diary : diaries) {
//            if(diary.getUserName() == username)
            if(Objects.equals(diary.getUserName(), username))
                return diary;
        }
        return null;
    }

    public void deleteDiary(String username) {
        for(MyDiary diary : diaries) {
            if(Objects.equals(diary.getUserName(), username))
                diaries.remove(diary);
        }
    }




}
