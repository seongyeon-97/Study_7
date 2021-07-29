package com.iu.s2.list.ex12;

import java.util.ArrayList;

public class Ex2Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(1);
		ar.add(2);
		MyList list = new MyList();
		list.add(ar, 3);
		list.add(ar, 6);
		System.out.println(ar);
		list.remove(ar);
		System.out.println(ar);
		
	}

}
