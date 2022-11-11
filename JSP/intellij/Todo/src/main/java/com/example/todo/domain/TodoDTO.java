package com.example.todo.domain;

public class TodoDTO {

    private long tno;
    private String todo;
    private String dueDate;
    private boolean finished;

    public long getTno() {
        return tno;
    }

    public void setTno(long tno) {
        this.tno = tno;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public TodoDTO(long tno, String todo, String dueDate, boolean finished) {
        this.tno = tno;
        this.todo = todo;
        this.dueDate = dueDate;
        this.finished = finished;
    }

    @Override
    public String toString() {
        return "TodoDTO{" +
                "tno=" + tno +
                ", todo='" + todo + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", finished=" + finished +
                '}';
    }
}
