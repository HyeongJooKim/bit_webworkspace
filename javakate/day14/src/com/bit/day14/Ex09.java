package com.bit.day14;

import java.util.Date;

public class Ex09 {

	public static void main(String[] args) {

		java.util.Date now=new java.util.Date();//생성되는 순간. 그 이후로 계산하면 업데이트 안됨
//		for(int i=0; i<999999; i++){
//			System.out.println(now); // 아무리 많이 돌려도 같은 값 나옴.
//			// 시간 흐르는 대로 시간 바꾸려면 for안에서 새 객체를 계속 찍어내야 함.
//			// java는 시간이 안정확한 편. 최대 6초/1년 오차 가능. 모든 전산 다 시간 안정확하다.
//		}
		System.out.println(now);// Mon May 25 14:22:43 KST 2020
//		System.out.print(now.getYear()+"년");//120년
		System.out.print(1900+now.getYear()+"년");//2020년 // 1900더해야 함
		System.out.print(1+now.getMonth()+"월");//5월 // 1더해야 함
		System.out.print(now.getDate()+"일");//25일
		System.out.print(now.getDay()+"요일");//0(일)~6(토)
		
		System.out.print(now.getHours()+"시");//14시
		System.out.print(now.getMinutes()+"분");//24분
		System.out.println(now.getSeconds()+"초");//50초

		String msg="";
		for(int i=0; i<9999; i++){
			msg+=i;
		}
		
		java.util.Date now2=new java.util.Date();//생성되는 순간. 그 이후로 계산하면 업데이트 안됨
		System.out.println(now2);// Mon May 25 14:22:43 KST 2020

		System.out.print(1900+now2.getYear()+"년");//2020년 // 1900더해야 함
		System.out.print(1+now2.getMonth()+"월");//5월 // 1더해야 함
		System.out.print(now2.getDate()+"일");//25일
		System.out.print(now2.getHours()+"시");//14시
		System.out.print(now2.getMinutes()+"분");//24분
		System.out.println(now2.getSeconds()+"초");//50초
		System.out.println("---------------------------------");
		System.out.println(now.before(now2));//true		
		System.out.println(now.after(now2));//false		
		System.out.println(now2.before(now));//false		
		System.out.println(now2.after(now));//true

		java.util.Date now3=now;
		System.out.println(now.compareTo(now));//0 같다
		System.out.println(now.compareTo(now2));//-1 now
		System.out.println(now2.compareTo(now));//1
		System.out.println(now3.compareTo(now));//0
		
		String msg2="2002/05/24 12:00:00";
		System.out.println(Date.parse(msg2));//1022209200000 // 문자를 시스템시간으로 읽음
		System.out.println(System.currentTimeMillis());//1590385366468
		System.out.println(now.getTime());
		System.out.println(now2.getTime()-now.getTime());//140 // 1000분의 1초 단위
		
		long t=System.currentTimeMillis();
		java.util.Date now4=new java.util.Date(t);
		System.out.println(now4);//Mon May 25 14:46:38 KST 2020
		
		java.util.GregorianCalendar gc=new java.util.GregorianCalendar();
		long t2=gc.getTimeInMillis();
		
		java.util.Date now5=new java.util.Date(t2);
		java.util.Calendar cal=java.util.Calendar.getInstance();
		long t3=cal.getTimeInMillis();
		java.util.Date now6=new java.util.Date(t3);
		System.out.println(now6);//Mon May 25 14:46:38 KST 2020
	}
}
