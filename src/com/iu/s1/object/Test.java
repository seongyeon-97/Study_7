package com.iu.s1.object;

public class Test {
	
	int num1 = 1;
	int num2 = 2;
	
	@Override
	public boolean equals(Object obj) {
		//test.num1 == test2.num이 같도록
		Test t2 = (Test)obj;
		boolean result = false;
		if(this.num1 == t2.num1 && this.num2 == t2.num2) {
			result = true;
		}
		
		return result;
	}
	
}
