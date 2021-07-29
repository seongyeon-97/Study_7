package com.iu.s2.list.ex1;

public class MemberView {
	
	//view
	public void view() {
		//mypage 선택시 실행하는 메서드
		//id, pw, age 출력
		//단, 메서드의 head는 변경x
		//멤버변수 선언 x
		MemberDTO dto = MemberSession.SESSION.get("member");
		System.out.println("--------------");
		System.out.println("ID : " + dto.getId());
		System.out.println("PW : " + dto.getPw());
		System.out.println("AGE : " + dto.getAge());
//		System.out.println("ID : " + MemberSession.SESSION.get("member").getId());
//		System.out.println("PW : " + MemberSession.SESSION.get("member").getPw());
//		System.out.println("AGE : " + MemberSession.SESSION.get("member").getAge());
		System.out.println("--------------");
	}
	
}
