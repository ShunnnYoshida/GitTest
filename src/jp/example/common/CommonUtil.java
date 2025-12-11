package jp.example.common;

public class CommonUtil {

    public static String createIfNotExists(String fileName) {
        java.io.File file = new java.io.File(fileName);

        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (Exception e) {
            throw new RuntimeException("ファイル作成エラー: " + fileName, e);
        }

        return file.getAbsolutePath();
    }

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }
}
