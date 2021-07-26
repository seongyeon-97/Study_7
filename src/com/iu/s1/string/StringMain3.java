package com.iu.s1.string;

public class StringMain3 {

	public static void main(String[] args) {
		
		String name = "hello world";
		char ch = 'o';
		boolean check = true;
		int num = 0;
		int count = 0;
		while(check) {
			
			num = name.indexOf(ch, num);
			
			if(num>0) {
				num++;
				count++;
			}else {
				System.out.println("종료");
				check = false;
			}
		}
		
		System.out.println(ch + "는 총 " + count + " 개 있습니다");
		
		name = "";
		boolean flag = name.isEmpty();
		System.out.println(flag);
		
//		int num = name.indexOf('l', 3);
//		System.out.println(num);

	}

}
