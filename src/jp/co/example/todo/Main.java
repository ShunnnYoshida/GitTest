package jp.example.app;

import jp.example.common.CommonUtil;   // ← 別 src の共通関数を利用

public class Main {

    public static void main(String[] args) {

        System.out.println("=== 実行開始 ===");

        // 共通関数の利用
        String path = CommonUtil.createIfNotExists("x.java");
        System.out.println("ファイル確認: " + path);

        TaskService service = new TaskService();
        service.executeTask();

        System.out.println("=== 実行終了 ===");
    }
}
