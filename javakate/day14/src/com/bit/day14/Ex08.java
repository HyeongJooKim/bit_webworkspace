package com.bit.day14;

import java.util.Calendar;

public class Ex08 {

	public static void main(String[] args) {
		java.util.GregorianCalendar cal=null;
		cal=new java.util.GregorianCalendar();
		// (2002,5,25)ó�� �� �ָ� �� �� 2002��6��25����µ�. �� �ϳ� ���ؾ� ��
		// ()�� ���� ���� ���
		
//		System.out.println(cal.toString());//java.util.GregorianCalendar[time=1590379628704,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",offset=32400000,dstSavings=0,useDaylight=false,transitions=30,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=4,WEEK_OF_YEAR=22,WEEK_OF_MONTH=5,DAY_OF_MONTH=25,DAY_OF_YEAR=146,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=1,HOUR_OF_DAY=13,MINUTE=7,SECOND=8,MILLISECOND=704,ZONE_OFFSET=32400000,DST_OFFSET=0]
		// Calendar�� ���� ����
		System.out.print(cal.get(Calendar.YEAR)+"��");// 2020�� 
		System.out.print(cal.get(Calendar.MONTH)+1+"��");// 5�� 
		System.out.print(cal.get(Calendar.DATE)+"��"); //25��
		System.out.print(cal.get(Calendar.HOUR_OF_DAY)+"��"); //13��
		System.out.print(cal.get(Calendar.MINUTE)+"��"); //11��
		System.out.println(cal.get(Calendar.SECOND)+"��"); //29��
	}
}
