package com.iu.s2.list;

import java.util.ArrayList;

import java.util.List;

public class ArrayList_2 {

	public static void main(String[] args) {
		
		//타입이 안전하지 않다.
		
		ArrayList<String> ar = new ArrayList<String>();
		
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		//List는 ArrayList의 super class(Interface)
		//단 , generic type도 일치해야
		//List<Integer> list = ar; (o)
		//List<Object> list =ar; (x)
		
		Object obj = ar2;
		
		List<Integer> lis = ar2;
	}

}
