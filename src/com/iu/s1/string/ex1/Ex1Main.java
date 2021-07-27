package com.iu.s1.string.ex1;

public class Ex1Main {

	public static void main(String[] args) {
		
		//날씨정보를 받아서 조회하는 프로그램
		//날씨정보는 도시명, 기온, 습도, 상태
		//1. 날씨정보를 전체 출력
		//2. 지역검색
		//3. 지역정보 추가
		//4. 종료
		
		System.out.println("----Weater Program----");
		
		WeatherController wc = new WeatherController();
		wc.start();
		
//		WeaterInfo weaterInfo = new WeaterInfo();
//		weaterInfo.makeWeater();
//		WeaterDTO [] weaterDTOs = weaterInfo.makeWeater();
//		
//		for(int i=0; i<weaterDTOs.length; i++) {
//
//			System.out.println(weaterDTOs[i].getCity());
//			System.out.println(weaterDTOs[i].getTemp());
//			System.out.println(weaterDTOs[i].getHum());			
//			System.out.println(weaterDTOs[i].getCondition());
//			System.out.println("---------------");
//		}
	}

}
