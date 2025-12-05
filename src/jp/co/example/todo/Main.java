package jp.co.example.todo;

import java.util.Scanner;

/**
 * コンソールから TODO を登録・一覧できるメインクラス.
 */
public class Main {

    public static void main(String[] args) {
        TaskService service = new TaskService();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== TODO 管理アプリ ===");

        while (true) {
            System.out.println();
            System.out.println("1: TODO追加");
            System.out.println("2: TODO一覧表示");
            System.out.println("3: TODOを完了にする");
            System.out.println("0: 終了");
            System.out.print("番号を入力してください：");

            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    System.out.print("TODOのタイトルを入力してください：");
                    String title = scanner.nextLine();
                    service.addTask(title);
                    System.out.println("追加しました。");
                    break;
                case "2":
                    service.printAllTasks();
                    break;
                case "3":
                    System.out.print("完了にしたい TODO のIDを入力してください：");
                    String idStr = scanner.nextLine();
                    try {
                        int id = Integer.parseInt(idStr);
                        boolean updated = service.completeTask(id);
                        if (updated) {
                            System.out.println("完了に更新しました。");
                        } else {
                            System.out.println("指定したIDの TODO が見つかりません。");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("IDは数値で入力してください。");
                    }
                    break;
                case "0":
                    System.out.println("アプリケーションを終了します。");
                    scanner.close();
                    return;
                default:
                    System.out.println("0〜3 の番号を入力してください。");
                    break;
            }
        }
    }
}
