package chapter13;
import java.io.*; 

public class FileWriterHmj {

	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		
		
		FileWriter fout = null;
		int c;
		try {
			fout = new FileWriter(args[0]);
			while((c = in.read()) != -1) {
				fout.write(c);
			}
			in.close();
			fout.close();
		}catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}

}
