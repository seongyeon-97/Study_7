package com.iu.s1.wrapper;

public class WrapperMain1 {

	public static void main(String[] args) {
		int num = 1;
		String str = "1";
		
		System.out.println(Integer.BYTES);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		
		String s="10";
		System.out.println(10+s);
	
		Integer i = new Integer(s);
		int num1 = i.intValue();
		System.out.println(num1+10);
		
		s = " 1";
		num = Integer.parseInt(s.trim());
		System.out.println(num+123);
		
		int n1 = 10;
		Integer n2 = Integer.valueOf(n1);
		Double d = Double.valueOf(3.12);
		
		n1 = n2.intValue();
		
		n2 = n1;
		
	}
}
