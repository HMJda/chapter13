package chapter13;
import java.io.*;
public class BinaryCopyHmj {

	public static void main(String[] args) {
		File src = new File(args[0]);
		File dest = new File(args[1]);
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			byte [] buf = new byte [1024*10];
			while(true) {
				int n=fi.read(buf);
				fo.write(buf,0,n);
				if(n<buf.length)
					break;
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath()+"를 "+dest.getPath()+"로 복사하였습니다.");
		}catch(IOException e) {
			System.out.println("파일 복사 오류");
		}
	}

}
