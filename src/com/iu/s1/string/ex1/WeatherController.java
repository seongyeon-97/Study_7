package com.iu.s1.string.ex1;

import java.util.Scanner;

public class WeatherController {
	
	private WeaterInfo weatherInfo;
	
	public WeatherController() {
		weatherInfo = new WeaterInfo();
	}
	
	public void start() {
		
		System.out.println("Start");
		
		
		boolean flag = true;
		
		while(flag) {
			weatherInfo.makeWeater();
			System.out.println("1. 전체 출력 " + "2. 지역검색 " + "3. 지역정보 추가 " + "4. 종  료");
			
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("전체 출력");				
				break;
			case 2 :
				System.out.println("지역 검색");
				break;
			case 3: 
				System.out.println("지역 추가");
				break;
			default :
				System.out.println("종   료");
				flag = false;
				break;
				
			}
		}
		
		System.out.println("Finish");
	}
	
}
