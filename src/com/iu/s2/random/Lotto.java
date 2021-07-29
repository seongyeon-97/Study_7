package com.iu.s2.random;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lotto {
	
	
	public HashSet<Integer> makeLotto2() {
		
		HashSet<Integer> hashSet = new HashSet<>();
		
		Random random = new Random();
		
		while(hashSet.size() != 6) {
			int num = random.nextInt(45)+1;
			hashSet.add(num);
		}
		return hashSet;
//		boolean check = hashSet.add(1);
//		System.out.println(check);
//		check = hashSet.add(1);
//		System.out.println(check);
//		System.out.println(hashSet.size());
		
	}

	public int [] makeLotto(){
		
		int [] nums = new int[6];
		Random random = new Random();
					
		for(int i =0; i<nums.length; i++) {
			
			nums[i] = random.nextInt(45)+1;	
			
			for(int j=0; j<i; j++) {
				if(nums[j] == nums[i]) {
					i--;
				}
			}
			
				
	
		
		}
		return nums;
		
	}
}	
	

