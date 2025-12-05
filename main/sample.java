package innerclass;

import java.io.File;
import java.io.IOException;

public class Sample {
	public static void main(String[] args) throws IOException{
		//「x.text」を扱えるようにする
		File file = new File("x.java");

		//existメソッドでファイルの存在を確かめ、存在がなければ新しいファイルを作成する
		if(file.exists() == false) {
			file.createNewFile();
		}
		//作成されたファイルの絶対パスを確認
		System.out.println(file.getAbsolutePath());
	}
}
