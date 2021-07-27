package com.iu.s1.string.ex1;

public class WeatherView {
	
	public void view(WeatherDTO [] dtos) {
		
		System.out.println("도시명 \t 기온 \t 습도 \t 날씨");
		System.out.println("============================");
		
		for(int i=0; i<dtos.length; i++) {
		System.out.print(dtos[i].getCity()+" \t ");
		System.out.print(dtos[i].getTemp()+" \t ");
		System.out.print(dtos[i].getHum()+" \t ");
		System.out.println(dtos[i].getCondition());
		System.out.println("============================");
		}
	}
	
	public void view(WeatherDTO weatherDTO) {
		
		if(weatherDTO == null) {
			System.out.println("등록되지 않은 도시입니다");
		}else {
		
			System.out.println("도시명 \t 기온 \t 습도 \t 날씨");
			System.out.println("============================");
			System.out.print(weatherDTO.getCity()+" \t ");
			System.out.print(weatherDTO.getTemp()+" \t ");
			System.out.print(weatherDTO.getHum()+" \t ");
			System.out.println(weatherDTO.getCondition());
			System.out.println("============================");			
			}
		}
	
	
}
