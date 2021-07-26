package com.iu.s1.string.ex1;

import java.util.Scanner;

public class WeaterInfo {
	private String info;
	StringBuffer sb;
	
	public WeaterInfo() {
		sb = new StringBuffer();
		sb.append("서울, 37, 80, 맑음,");
		sb.append("대구, 43, 90, 지옥,");
		sb.append("부산, -32, 10, 눈,");
		sb.append("제주, 3, 40, 비");
		
	}
	
	public void makeWeater() {
		
		System.out.println(sb);
		
			
	}
	
}
