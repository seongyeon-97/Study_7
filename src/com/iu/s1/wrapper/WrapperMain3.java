package com.iu.s1.wrapper;



public class WrapperMain3 {

	public static void main(String[] args) {
		String jumin = "971101-1048116";
		jumin = jumin.replace("-", "");
		
		int [] nums = new int[13];
		
		for(int i=0; i<13; i++) {
			String num = jumin.substring(i, i+1);
			int number = Integer.parseInt(num);
			if(i<=7) {			
				number = number*(i+2);
			}else if(i>7) {
				if(i==8) {
					number = number*2;
				}else if(i==9) {
					number = number*3;
				}else if(i==10) {
					number = number*4;
				}else if(i==11) {
					number = number*5;
				}
			}		
			nums[i]=number;
		}
		
		int hap = 0;		
		for(int i =0; i<nums.length-1; i++) {					
			hap = hap + nums[i];		
		}	
		System.out.println(hap);
		
		if(11-hap%11 == nums[12]) {
			
			System.out.println("올바른 번호입니다");		
			
		}else if(11-hap%11 > 10) {
			
			if((11-hap%11)%10 == nums[12]) {
				
				System.out.println("올바른 번호입니다");	
				
			}else {
				
				System.out.println("틀린 번호입니다");
			}
		}else {
			System.out.println("틀린 번호입니다");
		}	
		
		double d = Math.random();
		System.out.println(d);
	}
}
