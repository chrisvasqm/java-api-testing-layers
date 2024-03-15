package org.example;

public class Todo {
    private int id;
    private String title;

    private int userId;
    private boolean isCompleted;

    public Todo(int id, String title, int userId, boolean isCompleted) {
        this.id = id;
        this.title = title;
        this.userId = userId;
        this.isCompleted = isCompleted;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", userId=" + userId +
                ", isCompleted=" + isCompleted +
                '}';
    }
}
