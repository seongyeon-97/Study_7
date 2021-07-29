package com.iu.s2.calendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarMain1 {

	public static void main(String[] args) {
		
		Calendar ca = Calendar.getInstance();
		System.out.println(ca);
		
		int year = ca.get(Calendar.YEAR);
		System.out.println(year);
		int month = ca.get(Calendar.MONTH)+1;
		System.out.println(month);
		int date = ca.get(Calendar.DATE);
		System.out.println(date);
		
		//시분초
		int hour = ca.get(Calendar.HOUR_OF_DAY);
		System.out.println(hour);
		int minute = ca.get(Calendar.MINUTE);
		System.out.println(minute);
		int second = ca.get(Calendar.SECOND);
		System.out.println(second);
		
		Date d = ca.getTime();
		System.out.println(d);

	}

}
