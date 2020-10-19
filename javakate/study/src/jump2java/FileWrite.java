package jump2java;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;//byte단위로 처리하는 byte stream
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWrite {

	public static void main(String[] args) throws IOException {
		String path="out.txt";
		FileOutputStream fos=new FileOutputStream(path);
		
		for(int i=0; i<10; i++){
			String data=i+"번째 줄입니다.\r\n";
			fos.write(data.getBytes());
			//byte[] 배열을 넣어주면 파일에 내용을 String으로 작성함.
		}
		fos.close();
		//안 해도 java 종료시 자동으로 닫힘.
		//그러나 자바가 열린 상태에선 에러발생할 수 있으니 닫을 것.
		
		
		String path2="out2.txt";
		FileWriter fw=new FileWriter(path2);
		for(int i=0; i<10; i++){
			String data=i+"번째 줄입니다.\r\n";
			fw.write(data);
			//String을 변환 안하고 그대로 넣을 수 있음.
			//그러나 여전히 \r\n 써줘야 함.
		}
		fw.close();
		
		String path3="out3.txt";
		PrintWriter pw=new PrintWriter(path3);
		for(int i=0; i<10; i++){
			String data=i+"번째 줄입니다.";
			pw.println(data);
			//개행되어 나옴
					
		}
		pw.close();
		
		//내용 추가 FileWriter
		FileWriter fw2=new FileWriter(path2, true);
		//true 들어가면 제일 끝에 내용 덧붙이는 것.
		for(int i=10; i<20; i++){
			String data=i+"번째 줄입니다.\r\n";
			fw2.write(data);
		}
		fw2.close();
		
		//내용추가 - PrintWriter
		PrintWriter pw2=new PrintWriter(new FileWriter(path3, true));
		for(int i=10; i<20; i++){
			String data=i+"번째 줄입니다.";
			pw2.println(data);
			//개행되어 나옴
					
		}
		pw2.close();
	}

}
