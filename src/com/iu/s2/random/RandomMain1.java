package com.iu.s2.random;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class RandomMain1 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		Lotto lotto = new Lotto();
		Passsword passsword = new Passsword();
		
		ArrayList<Character> ar = passsword.password();
		
		for(int i =0; i<ar.size(); i++) {
			System.out.print(ar.get(i));
		}
		
		
		
		
//		HashSet<Integer> hashSet = lotto.makeLotto2();
//		
//		Iterator<Integer> it = hashSet.iterator();
//		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
//		int [] ar = lotto.makeLotto();
//		
//		for(int i=0; i<ar.length; i++) {
//			System.out.println(ar[i]);
//		}
		
	}

}
