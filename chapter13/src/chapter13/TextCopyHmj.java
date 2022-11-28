package chapter13;
import java.io.*;

public class TextCopyHmj {

	public static void main(String[] args) {
		File src = new File(args[0]);
		File dest = new File(args[1]);
		
		int c;
		try {
			FileReader fr = new FileReader(src);
			FileWriter fw = new FileWriter(dest);
			while((c = fr.read()) != -1) {
				fw.write((char)c);
			}
			fr.close();
			fw.close();
			System.out.println(src.getPath()+"를 "+dest.getPath()+"로 복사하였습니다.");
		}catch(IOException e) {
			System.out.println("파일 복사 오류");
		}

	}

}
