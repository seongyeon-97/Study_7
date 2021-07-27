package com.iu.s1.string.ex1;

import java.util.Scanner;

public class WeatherInfo {
	private String info;
	StringBuffer sb;
	
	public WeatherInfo() {
		sb = new StringBuffer();
		sb.append("서울, 37, 80, 맑음,");
		sb.append("대구, 43, 90, 지옥,");
		sb.append("부산, -32, 10, 눈,");
		sb.append("제주, 3, 40, 비");
		
	}
	
	public WeatherDTO [] makeWeater() {
		
		String a = sb.toString();
		System.out.println(sb);		
		
		a = a.trim();
		a = a.replace(" ", "");
		//파싱(parsing) - 하나의 문자열을 자르는 작업
		String [] infos = a.split(",");
		
		WeatherDTO [] dtos = new WeatherDTO[infos.length/4];
		int j= -1;
		for(int i =0; i<dtos.length; i++) {
			
			WeatherDTO weaterDTO = new WeatherDTO();		
			
			weaterDTO.setCity(infos[++j]);
			weaterDTO.setTemp(infos[++j]);
			weaterDTO.setHum(infos[++j]);
			weaterDTO.setCondition(infos[++j]);
			dtos[i] = weaterDTO;				
		}
		return dtos;	
	}
	
	public WeatherDTO searchWeather(WeatherDTO [] dtos) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("검색할 도시를 입력해주세요 :");		
		String cityname = sc.next();
		WeatherDTO weatherDTO = null;
		for(int i=0; i<dtos.length; i++) {
			if(dtos[i].getCity().equals(cityname)) {
				weatherDTO = dtos[i];
				break;
			}
		}		
		
		return weatherDTO;
	}
	
}
