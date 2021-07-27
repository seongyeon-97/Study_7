package com.iu.s1.wrapper;



public class WrapperMain3 {

	public static void main(String[] args) {
		String jumin = "971101-1048116";
		jumin = jumin.replace("-", "");
		int [] nums = new int[13];
		for(int i=0; i<13; i++) {
			String num = jumin.substring(i, i+1);
			int number = Integer.parseInt(num);
			if(i>8) {			
				int j=0;
				++j;
				number = number*(j+2);
				
				System.out.println("------");
				System.out.println(j);
				System.out.println("------");
			}else {
			number = number*(i+2);
			}
			nums[i]=number;
		}
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		
				
	}

}
