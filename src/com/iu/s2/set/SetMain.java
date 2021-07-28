package com.iu.s2.set;

import java.util.HashSet;
import java.util.Iterator;

public class SetMain {

	public static void main(String[] args) {
		
		HashSet<Integer> hashSet = new HashSet<>();
		
		hashSet.add(1);
		hashSet.add(200);
		hashSet.add(1);
		System.out.println(hashSet);
		System.out.println(hashSet.size());

		//전체출력
		Iterator<Integer> it = hashSet.iterator();
		while(it.hasNext()) {
			Integer num = it.next();
			System.out.println(num);
		}
	}

}
