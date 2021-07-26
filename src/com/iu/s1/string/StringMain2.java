package com.iu.s1.string;

public class StringMain2 {

	public static void main(String[] args) {
		
		//String name = new String("hello world");과 같음
		String name = "hello world";
		
		char a = name.charAt(1);
		System.out.println(a);
		
		name = "991021-1234567";
		char ch = name.charAt(7);
		System.out.println(ch);
		if(ch == '1' || ch == '3') {
			System.out.println("남자입니다");
		}else {
			System.out.println("여자입니다");
		}
		
		ch = name.charAt(200);
		System.out.println(ch);

	}

}
