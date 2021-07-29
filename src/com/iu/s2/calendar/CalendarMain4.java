package com.iu.s2.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarMain4 {

	public static void main(String[] args) {
		
		Calendar ca = Calendar.getInstance();
		//2021년 7월 29일 형식으로 print
		
		int year = ca.get(Calendar.YEAR);
		int month = ca.get(Calendar.MONTH)+1;
		int date = ca.get(Calendar.DATE);
		
		System.out.println(year + "년" + month + "월" + date + "일");
		
		Date date1 = ca.getTime();
		String patten = "yyyy년 MM월 dd일 E요일";
		
		SimpleDateFormat sf = new SimpleDateFormat(patten);
		String result = sf.format(date1);
		System.out.println(result);
		
		

	}

}
