package com.iu.s3.exception;

public class Test3 {
	
	public void t3() throws Exception {
		int num1 = 40;
		int num2 = 50;
		
		int num3 = num1 + num2;
		int num4 = num1 -num2;
		
		if(num3>99) {
			throw new MyException("세자리수는 모릅니다");
		}
		
		if(num4<0) {
			throw new MyException("음수는 몰라여");
		}
		
//		System.out.println(num3);
		}
	
}
