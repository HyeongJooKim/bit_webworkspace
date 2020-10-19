package jump2java;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateDiff {

	public static void main(String[] args) {

		String date1="20070501";
		String date2="20200331";
		
		//두 날짜 의 일 수 차이 구하기
		
		Calendar da1=new GregorianCalendar(Integer.parseInt(date1.substring(0, 4)),
				Integer.parseInt(date1.substring(4, 6)),
				Integer.parseInt(date1.substring(6)));
		Calendar da2=new GregorianCalendar(Integer.parseInt(date2.substring(0, 4)),
				Integer.parseInt(date2.substring(4, 6)),
				Integer.parseInt(date2.substring(6)));
		long diffSec=(da2.getTimeInMillis()-da1.getTimeInMillis())/1000;
		long diffDays=diffSec/60/60/24;
		
		System.out.println(diffDays);
	}
}