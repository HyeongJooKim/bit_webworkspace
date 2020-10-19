package com.bit.day14;

import java.util.Calendar;

// java.util 중 Calendar class
// public abstract class Calendar, 날짜를 생성하지는 않지. 있는 날짜값을 가져오는 거지
public class Ex07 {

	public static void main(String[] args) {
//		java.util.Calendar cal=new java.util.Calendar();// 이렇게 못씀

		java.util.Calendar cal=java.util.Calendar.getInstance();// 이렇게 쓰라고 API에 설명되어 있음
//		System.out.println(cal); //출력내용: java.util.GregorianCalendar[time=1590377374748,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",offset=32400000,dstSavings=0,useDaylight=false,transitions=30,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=4,WEEK_OF_YEAR=22,WEEK_OF_MONTH=5,DAY_OF_MONTH=25,DAY_OF_YEAR=146,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=0,HOUR_OF_DAY=12,MINUTE=29,SECOND=34,MILLISECOND=748,ZONE_OFFSET=32400000,DST_OFFSET=0]

//		어찌 활용하나?
//		System.out.println(cal.get(0)); //1
//		System.out.println(cal.get(1)); //2020 연도
//		System.out.println(cal.get(2)); //4
//		System.out.println(cal.get(3)); //22
//		System.out.println(cal.get(4)); //5 월
//		System.out.println(cal.get(5)); //25 일
//		System.out.println(cal.get(6)); //146
//		System.out.println(cal.get(7)); //2
		//번호를 모르니 이렇게 변수명으로 호출하면 됨
		System.out.print(cal.get(Calendar.YEAR)+"년");// 2020년 출력 
		System.out.print(cal.get(Calendar.MONTH)+1+"월");//0~11월. 1 더해줘야 함 
//		System.out.print(1+cal.get(Calendar.MONTH)+"월");//0~11월. 1 더해줘야 함 
		System.out.print(cal.get(Calendar.DATE)+"일"); 
//		System.out.print(cal.get(Calendar.DAY_OF_WEEK)+"요일"); //1~7로 나옴
	
		char ch='?';
		switch (cal.get(Calendar.DAY_OF_WEEK)){
		case 1: ch='일'; break;
		case 2: ch='월'; break;
		case 3: ch='화'; break;
		case 4: ch='수'; break;
		case 5: ch='목'; break;
		case 6: ch='금'; break;
		case 7: ch='토'; break;
		default: break;
		}
		System.out.println(ch+"요일");//월요일 출력
//		System.out.println(cal.get(Calendar.AM_PM));// 1 나오네
		
		if(cal.get(Calendar.AM)==0){
			System.out.print("AM ");
			System.out.print(cal.get(Calendar.HOUR)+"시 or "); 
		}else if(cal.get(Calendar.AM)==1){
			System.out.print("PM ");
			System.out.print(cal.get(Calendar.HOUR)+"시 or ");
		}
		
		System.out.print(cal.get(Calendar.HOUR_OF_DAY)+"시"); 
		System.out.print(cal.get(Calendar.MINUTE)+"분"); 
		System.out.println(cal.get(Calendar.SECOND)+"초");
//		System.out.print(cal.get(Calendar.)+"초");
		
		System.out.println(cal.get(Calendar.WEEK_OF_YEAR)+"주/년");
		System.out.println(cal.get(Calendar.DAY_OF_YEAR)+"일/년");		
		System.out.println(cal.get(Calendar.WEEK_OF_MONTH)+"주차/달");		
		
	}

}
