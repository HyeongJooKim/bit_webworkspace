package com.bit.day14;

import java.util.Calendar;

// java.util �� Calendar class
// public abstract class Calendar, ��¥�� ���������� ����. �ִ� ��¥���� �������� ����
public class Ex07 {

	public static void main(String[] args) {
//		java.util.Calendar cal=new java.util.Calendar();// �̷��� ����

		java.util.Calendar cal=java.util.Calendar.getInstance();// �̷��� ����� API�� ����Ǿ� ����
//		System.out.println(cal); //��³���: java.util.GregorianCalendar[time=1590377374748,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",offset=32400000,dstSavings=0,useDaylight=false,transitions=30,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=4,WEEK_OF_YEAR=22,WEEK_OF_MONTH=5,DAY_OF_MONTH=25,DAY_OF_YEAR=146,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=0,HOUR_OF_DAY=12,MINUTE=29,SECOND=34,MILLISECOND=748,ZONE_OFFSET=32400000,DST_OFFSET=0]

//		���� Ȱ���ϳ�?
//		System.out.println(cal.get(0)); //1
//		System.out.println(cal.get(1)); //2020 ����
//		System.out.println(cal.get(2)); //4
//		System.out.println(cal.get(3)); //22
//		System.out.println(cal.get(4)); //5 ��
//		System.out.println(cal.get(5)); //25 ��
//		System.out.println(cal.get(6)); //146
//		System.out.println(cal.get(7)); //2
		//��ȣ�� �𸣴� �̷��� ���������� ȣ���ϸ� ��
		System.out.print(cal.get(Calendar.YEAR)+"��");// 2020�� ��� 
		System.out.print(cal.get(Calendar.MONTH)+1+"��");//0~11��. 1 ������� �� 
//		System.out.print(1+cal.get(Calendar.MONTH)+"��");//0~11��. 1 ������� �� 
		System.out.print(cal.get(Calendar.DATE)+"��"); 
//		System.out.print(cal.get(Calendar.DAY_OF_WEEK)+"����"); //1~7�� ����
	
		char ch='?';
		switch (cal.get(Calendar.DAY_OF_WEEK)){
		case 1: ch='��'; break;
		case 2: ch='��'; break;
		case 3: ch='ȭ'; break;
		case 4: ch='��'; break;
		case 5: ch='��'; break;
		case 6: ch='��'; break;
		case 7: ch='��'; break;
		default: break;
		}
		System.out.println(ch+"����");//������ ���
//		System.out.println(cal.get(Calendar.AM_PM));// 1 ������
		
		if(cal.get(Calendar.AM)==0){
			System.out.print("AM ");
			System.out.print(cal.get(Calendar.HOUR)+"�� or "); 
		}else if(cal.get(Calendar.AM)==1){
			System.out.print("PM ");
			System.out.print(cal.get(Calendar.HOUR)+"�� or ");
		}
		
		System.out.print(cal.get(Calendar.HOUR_OF_DAY)+"��"); 
		System.out.print(cal.get(Calendar.MINUTE)+"��"); 
		System.out.println(cal.get(Calendar.SECOND)+"��");
//		System.out.print(cal.get(Calendar.)+"��");
		
		System.out.println(cal.get(Calendar.WEEK_OF_YEAR)+"��/��");
		System.out.println(cal.get(Calendar.DAY_OF_YEAR)+"��/��");		
		System.out.println(cal.get(Calendar.WEEK_OF_MONTH)+"����/��");		
		
	}

}
