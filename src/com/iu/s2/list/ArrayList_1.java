package com.iu.s2.list;

import java.util.ArrayList;

public class ArrayList_1 {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		
		ar.add("First");
		//System.out.println(ar.size());
		ar.add("second");
		//System.out.println(ar.size());
		ar.add("third");
		//System.out.println(ar.size()); //배열의 길이를 나타냄 length와 같은 역할
		
		ar.add(5);
		ar.add(true);
		ar.add('a');
		
		//System.out.println(ar.get(0));
		
		ar.add(1, "add");
		ar.set(3, 123);
		ar.remove(0);
		ar.clear();
		System.out.println(ar.size());
		System.out.println(ar.isEmpty()); //비어있냐 안비어있냐
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		System.out.println("------------------------");
		
		ar.add("first");
		ar.add(2);
		ar.add(3.333);
		ar.add('4');
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		
		
		String s0 = (String)ar.get(0);
		
		int s1 = (Integer)ar.get(1);
		
		double s2 = (Double)ar.get(2);
		
		char s3 = (Character)ar.get(3);
		
	}

}
