package jp.co.example.todo;

/**
 * TODO 1件分を表すクラス.
 */
public class Task {

    private final int id;      // 連番ID
    private final String title;
    private boolean completed; // 完了しているかどうか

    public Task(int id, String title) {
        this.id = id;
        this.title = title;
        this.completed = false;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void complete() {
        this.completed = true;
    }

    @Override
    public String toString() {
        String status = completed ? "[完了]" : "[未完了]";
        return String.format("ID=%d %s %s", id, status, title);
    }
}
