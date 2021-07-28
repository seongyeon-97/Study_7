package com.iu.s2.list.ex1;

import java.util.ArrayList;

import com.iu.s2.list.Member;

public class Ex1Main {

	public static void main(String[] args) {
		
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberDTO> ar = dao.memberInit();
		//dao.memberAdd(ar);
		//int result = dao.memberDelete(ar);
		
//		if(result > 0) {
//			System.out.println("삭제 성공");
//		}else {
//			System.out.println("삭제 실패");
//		}
		
		MemberDTO dto = dao.memberLogin(ar);
		if(dto != null) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
		
		
//		for(int i=0; i<ar.size(); i++) {
//			System.out.println("ID : " + ar.get(i).getId());
//			System.out.println("PW : " + ar.get(i).getPw());
//			System.out.println("AGE : " + ar.get(i).getAge());
//			System.out.println("-------------------");			
//		}
		
		
	}

}
