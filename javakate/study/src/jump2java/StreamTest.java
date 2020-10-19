package jump2java;

import java.io.BufferedReader;//String
import java.io.IOException;
import java.io.InputStream;//byte
import java.io.InputStreamReader;//character

public class StreamTest {

	public static void main(String[] args) throws IOException {

		InputStream in=System.in;
		//java.lang 이외의 클래스들은 import해야 함.
		
//		int a;
//		a=in.read();
		//read();는 1바이트씩 data를 읽어서 long 정수로 반환해 줌.
		//0~255사이의 정수로 아스키코드값
		//한번 실행하면 1바이트만 읽고 멈춤.
		//Stream: 이어져 있는 데이더(byte)의 형태
		
//		System.out.println(a);
		
		InputStreamReader reader=new InputStreamReader(in);
		//byte[] 대신, char[] 사용
		char[] isr=new char[3];
		reader.read(isr);
		System.out.println(isr);

		//사용자가 쓴만큼 다 읽어들이고 싶다면?
		BufferedReader br=new BufferedReader(reader);
		
		String a=br.readLine();//사용자가 엔터칠 때까지 읽어들임.
		System.out.println(a);
	}

}
