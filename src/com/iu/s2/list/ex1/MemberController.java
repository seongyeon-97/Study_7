package com.iu.s2.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberController {
	
	public void start() {
		//1. 회원가입
		//2. 로그인
		//3. 프로그램 종료
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberDTO> ar = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		while(flag) {
			System.out.println("1. 회원가입 " + "2. 로그인 " + "3. 종   료");			
			int select = sc.nextInt();
			switch(select) {
				case 1 :
					dao.memberAdd(ar);
					break;
				case 2 :
					MemberDTO dto = dao.memberLogin(ar);
					if(dto != null) {
					System.out.println("로그인 성공");
					}else {
						System.out.println("로그인 실패");
					}
					break;
				default :
					System.out.println("프로그램 종료");
					flag = false;
					break;
			}
		}
		
		
	}
}
