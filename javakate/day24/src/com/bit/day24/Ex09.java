package com.bit.day24;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//문자열스트림
//자바에서만 제공하는 특이한 기능.
//문자열 제어에 특화된 기능. 2바이트 체계임.
//문자 이외의 데이터도 읽고 쓸 수 있겠으나, 홀수 개 자료인 경우 오류날 수 있음.

public class Ex09 {

	public static void main(String[] args) {

		String path="data.bin";//"문자열을 출력합니다"
		File file=new File(path);
		String msg="문자열 스트림을 통해\n파일에 작성합니다";
		char[] arr=msg.toCharArray();
		java.io.FileReader fr=null;
		java.io.FileWriter fw=null;
		
		try {
			fw=new FileWriter(file);
//			for(int i=0; i<arr.length; i++){
//				fw.write(arr[i]);
//			}
			fw.write(msg);//위 for문을 이렇게 써도 됨.
			fw.flush();//너무 데이터 적어서 안나온 듯. 밀어냄
			
			fr=new FileReader(file);
			while(true){
				int su=fr.read();
				if(su==-1){break;}
				System.out.print((char)su);//2바이트의 숫자들 나옴. (char)변환하면 문자로 나옴
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally{
			try {
				if(fr!=null){fr.close();}
				if(fw!=null){fw.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}