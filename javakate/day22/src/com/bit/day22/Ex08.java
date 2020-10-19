package com.bit.day22;

//시계 만들기

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex08 {

	public static void main(String[] args) {

		for(int i=0; i<10; i++){
			Date date=new Date();
			SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss");
			String msg=sdf.format(date);
			System.out.println(msg);
			try {
				Thread.sleep(1000);//1초 쉬고난 뒤 Runnable 상태로 돌아감.
				//반복 수행하는 시간도있으므로 정확하게 1초는 아님.
				//1초 좀 이상 쉴 것. java의 시간은 별로 안정확함
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
