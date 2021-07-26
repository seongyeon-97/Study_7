package com.iu.s1.string;

public class StringMain6 {

	public static void main(String[] args) {
		
		String weather = "서울-대구-대전-광주-부산-제주";
		//하나의 문자열에서 도시 이름만 추출
		
		String [] citys = weather.split("-");
		
		for(int i=0; i<citys.length; i++) {
			System.out.println(citys[i]);
		}
		
		System.out.println("-----------------------------");
		
		weather = "32 89 45 67";
		
		String [] numbers = weather.split(" ");
		
		for(int i=0; i<numbers.length; i++ ) {
			System.out.println(numbers[i]);
		}
		
		String name = "  Te st       ";
		name = name.trim();
		name = name.replace(" ","");
		System.out.println(name.equals("Test"));
		

	}

	private static Object trim(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
