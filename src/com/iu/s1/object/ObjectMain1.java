package com.iu.s1.object;

public class ObjectMain1 {

	public static void main(String[] args) {
		//객체생성코드
		//클래스명 참조변수명 = new 생성자();
		
		Object obj = new Object();
		
		//멤버변수, 멤버메서드 호출
		//참조변수명.메서드명([인자값들...]);
		
		int num = obj.hashCode();
		System.out.println(num);
		
		String a = obj.toString();
		System.out.println(a);
		System.out.println(obj);
		
		Object obj2 = new Object();
		
		boolean flag = obj.equals(obj2);
		System.out.println(flag);
		
		
	}

}
