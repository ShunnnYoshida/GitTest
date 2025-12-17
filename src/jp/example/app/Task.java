package jp.example.app;

public class Task {

    private int id;
    private String name;

    // コンストラクタについて
    public Task(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // ID の getter
    public int getId() {
        return id;
    }

    // Name の getter
    public String getName() {
        return name;
    }

    // デバッグしやすさのため toString を実装
    @Override
    public String toString() {
        return "Task{id=" + id + ", name='" + name + "'}";
    }
}
