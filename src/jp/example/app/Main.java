package jp.example.app;

import jp.example.common.CommonUtil;
public class Main {

    public static void main(String[] args) {

        System.out.println("=== 実行開始 ===");

        String path = CommonUtil.createIfNotExists("x.java");
        System.out.println("ファイル確認: " + path);

        TaskService service = new TaskService();
        service.executeTask();

        System.out.println("=== 実行終了 ===");
    }
}
