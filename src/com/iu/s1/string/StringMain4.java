package com.iu.s1.string;

public class StringMain4 {

	public static void main(String[] args) {
		
		String n1 = "iu";
		String n2 = "iu";
		String n3 = new String("iu");
		String n4 = new String("iu");
		
		System.out.println(n1 == n2); //true
		System.out.println(n3 == n4); // false
		System.out.println(n1 == n3); // false
		System.out.println("==========================");
		System.out.println(n1.equals(n2));
		System.out.println(n3.equals(n4));
		System.out.println(n1.equals(n3));
		
		
		

	}

}
