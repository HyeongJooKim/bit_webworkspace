package com.bit.day24;

//버퍼처리 해보자
//속도가 가장 느린 IO작업에 버퍼를 설정함으로써 처리속도를 올릴 수 있다.

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex06 {

	public static void main(String[] args) {
		String path="data.bin";//여기서 읽어서
		String path2="data2.bin";//여기에 써보자
		File file=new File(path);
		File file2=new File(path2);

		if(!file2.exists()){
			try {
				file2.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		byte[] buf=new byte[128];//적게 주면 반복을 많이, 크게 주면 반복을 적게 할 뿐, 아래에서 복사되는 결과는 같다. 정확하게 복제 됨.
		//너무 작게 주면 오류 발생.
		//버퍼크기 모자라면 다시 돌게 되는데 다시 돌 때 기존 값이 남아서 문제.
		//반복문 안으로 옮겨서 매번 새로 시작하게 만들었다.
		//그러나 해결된 것으로 보이는 것. 파일사이즈 보면 다르다.
		//사실은 나머지칸은 빈칸이 생성된 것.
		//문자열 아닌 경우는 복사 제대로 안됨.
		//진정 해결하려면 버퍼 크기를 읽은 크기만큼만으로 해줘야 함.
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {

			fis=new FileInputStream(file);
			fos=new FileOutputStream(file2);
			while(true){
				int su=fis.read(buf);
				if(su==-1){break;}
				fos.write(buf,0,su);//0	부터 su개 만큼 써라. 읽어들인 su만큼만 복제하는 것.
			}
			System.out.println("복사완료");
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(fos!=null){try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}}
		}
	}
}
