package jp.example.app;

import jp.example.common.CommonUtil;

public class TaskService {

    public void executeTask() {

        Task task = new Task(1, "テストタスク");

        if (CommonUtil.isNullOrEmpty(task.getName())) {
            System.out.println("タスク名が空です");
        } else {
            System.out.println("タスク名: " + task.getName());
        }
    }
}
