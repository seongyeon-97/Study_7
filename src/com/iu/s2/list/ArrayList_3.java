package com.iu.s2.list;

import java.util.ArrayList;

public class ArrayList_3 {

	public static void main(String[] args) {
		
		//Member 타입을 모으려고 하는 list를 선언
		
		ArrayList<Member> ar = new ArrayList<>();
		
		Member member = new Member();
		member.setId("iu");
		member.setPw("adfg");
		ar.add(member);		
		
		ar.add(new Member()); // 1
		ar.get(1).setId("oi"); // Member
		
		for(int i=0; i<ar.size(); i++) {
		Member mem = ar.get(i);
		System.out.println(mem.getId());
		System.out.println(mem.getPw());
		System.out.println("--------");
		}
		
	}

}
