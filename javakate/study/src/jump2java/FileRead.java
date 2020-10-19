package jump2java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException {

		String path="out.txt";//블러올 파일의 경로 지정
		File file=new File(path);//해당 경로에 있는 파일을 인식 
		
		FileInputStream fis=new FileInputStream(file);//파일 내용을 읽어일 새 스트림 마련
		byte[] by=new byte[(int)file.length()];//파일의 크기(byte단위)만큼 파일 내용을 byte[]에 담음
		fis.read(by);//byte[] 에 담긴 데이터를 읽어들임.
		System.out.println(new String(by));//byte[]을 새 문자열로 인쇄
		fis.close();
		
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		while(true){
			String line=br.readLine();//줄단위로 읽음
			if(line==null)break;
			System.out.println(line);
		}
		br.close();
		
	}

}
