package com.iu.s2.random;

import java.util.ArrayList;
import java.util.Random;

public class Passsword {
	
	// 랜덤한 패스워드 생성
	//대문자 소문자 숫자 조합, 8글자
	//1. 대문자, 소문자, 숫자를 쓸꺼냐가 결정 - 랜덤하게 random.nextInt(3)+1;
	//2. 글자를 랜덤하게 뽑기
	//
	public ArrayList<Character> password() {
		
		ArrayList<Character> ar = new ArrayList<>();   
		
		for(int i =0; i<8; i++) {
		Random random = new Random();
		int select = random.nextInt(3)+1;
			if(select == 1) {
				//System.out.println("숫자사용");
				int nums = random.nextInt(10)+48;
				ar.add((char)nums);
			}else if(select == 2) {
				//System.out.println("대문자사용");
				int str = random.nextInt(26)+65;
				ar.add((char)str);
			}else {
				//System.out.println("소문자사용");
				int str2 = random.nextInt(26)+97;
				ar.add((char)str2);
			}
		}
		return ar;
		
	}
	
}
