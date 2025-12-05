package jp.co.example.todo;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO の一覧管理を行うサービスクラス.
 */
public class TaskService {

    private final List<Task> tasks = new ArrayList<>();
    private int nextId = 1; // ID用の連番

    /**
     * 新しい TODO を追加する.
     */
    public void addTask(String title) {
        Task task = new Task(nextId, title);
        tasks.add(task);
        nextId++;
    }

    /**
     * 全ての TODO をコンソールに表示する.
     */
    public void printAllTasks() {
        if (tasks.isEmpty()) {
            System.out.println("登録されている TODO はありません。");
            return;
        }

        System.out.println("=== TODO 一覧 ===");
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    /**
     * 指定IDの TODO を完了状態にする.
     *
     * @param id 対象ID
     * @return 更新できたら true / 見つからなければ false
     */
    public boolean completeTask(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.complete();
                return true;
            }
        }
        return false;
    }
}
