package com.bit.day24;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//제공되는 버퍼 활용

public class Ex07 {

	public static void main(String[] args) {

		String path="data.bin";//여기서 읽어서
		String path2="data2.bin";//여기에 써보자
		File src=new File(path);
		File target=new File(path2);
		
		FileInputStream fis=null;
		FileOutputStream fos=null;

		BufferedInputStream bis=null;
		BufferedOutputStream bos=null;
//		byte[] buf=new byte[8];
		//사용자정의 버퍼를 하나 더해서 성능은 올릴 수 있으나 자원소모는 더 많다.
		//정답은 없음. 개발 상황에 따라 결정
		
		try {
			fis=new FileInputStream(src);
			fos=new FileOutputStream(target);
			
			bis=new BufferedInputStream(fis);//이미 bis객체가 생성되면서 fis 값을 담아놓고 있음.
			bos=new BufferedOutputStream(fos);
			
			while(true){
				int su=bis.read();//하나의 바이트 값
//				su=bis.read(buf);//buf[]의 크기, 이 경우는 첫바퀴는 8
				if(su==-1){break;}
				bos.write(su);//버퍼가 차면 버퍼를 비우면서 씀.
//				bos.write(buf,0,su);
			}
			bos.flush();//버퍼가 차지 않아도 버퍼에 있던 값을 밀어냄.
			//반복문 안에 이게 있으면 데이터 하나마다 밀어내니 효율 떨어짐
			//장점: 버퍼가 다 차지 않아도 내가 원하는 모든 값을 밀어냄.
			//close를 하면 자동으로 flush를 호출하고 있음.
			//close 는 안원하는데 데이터만 밀어내고 싶을 때 사용
			System.out.println("복사완료");
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(bos!=null){bos.close();}//생성한 역순으로 close
				if(bis!=null){bis.close();}
				if(fos!=null){fos.close();}
				if(fis!=null){fis.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}