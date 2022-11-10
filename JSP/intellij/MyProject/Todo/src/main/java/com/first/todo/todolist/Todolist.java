package com.first.todo.todolist;

public class Todolist {
    private String title;
    private String date;
    private String check;

    public Todolist(String title, String date, String check) {
        this.title = title;
        this.date = date;
        this.check = check;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCheck() {
        return check;
    }

    public void setCheck(String check) {
        this.check = check;
    }

    @Override
    public String toString() {
        return "Todolist{" +
                "title='" + title + '\'' +
                ", date='" + date + '\'' +
                ", check=" + check +
                '}';
    }
}
