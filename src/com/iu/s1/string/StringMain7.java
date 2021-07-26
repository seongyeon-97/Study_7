package com.iu.s1.string;

public class StringMain7 {

	public static void main(String[] args) {
		
//		int num = 10; //"10"
//		String n = String.valueOf(num);
//		System.out.println(n);
//		
//		String a = "abc";
//		String b = "def";
//		a=a+b;

		String n1 = "abc";
		String n2 = "def";
		
		StringBuffer sb = new StringBuffer();
		sb.append(n1);
		sb.append(n2);
		sb.append(34);
		System.out.println(sb); //sb.toString()가 호출됨
		
		String str = sb.toString();
		System.out.println(str);
		
	}

}
