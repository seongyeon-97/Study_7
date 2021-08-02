package com.iu.s4.io;

import java.util.Calendar;
import java.util.HashSet;
import java.util.UUID;

public class IoMain2 {

	public static void main(String[] args) {

		String fileName = "";
		
		//fileName을 생성 하는 코드
		HashSet<String> hs = new HashSet<>();
		hs.add(fileName);
		fileName = "abc";
		
		Calendar calendar = Calendar.getInstance();
		long time = calendar.getTimeInMillis();
		
		fileName = String.valueOf(time);

		//몇번을 돌리든 중복되지 않는다는 보장이 있어야 함
		
		System.out.println(fileName);
		
		fileName = UUID.randomUUID().toString();
		 System.out.println(fileName);
		
	}

}
