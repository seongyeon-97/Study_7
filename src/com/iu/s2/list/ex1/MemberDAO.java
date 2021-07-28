package com.iu.s2.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MemberDAO {
	
	//데이터에 접근하는 클래스
	private String info;
	private Scanner sc;

	
	public MemberDAO() {
		//생성자 호출
		info = "iu,pw1,32,suji,pw2,27,choa,pw3,30";
		sc = new Scanner(System.in);

	}
	
	//memberLogin
	//Scanner로 id, pw만 입력 받기 -> MemberDTO 멤버변수에 추가
		//매개변수로 ArrayList를 받아서 입력받은 id와 pw 둘다 일치하는 인덱스를 찾아서 리턴
	public MemberDTO memberLogin(ArrayList<MemberDTO> ar) {
		
		MemberDTO dto = new MemberDTO();
		System.out.println("검색할 ID를 입력하세요 : ");
		String mid = sc.next();
		dto.setId(mid);
		System.out.println("검색할 PW를 입력하세요 : ");
		String mpw = sc.next();
		dto.setPw(mpw);
		MemberDTO result = null;
		for(int i =0; i<ar.size(); i++) {
			if(mid.equals(ar.get(i).getId()) && mpw.equals(ar.get(i).getPw())) {				
				result = ar.get(i);
				break;
			}
		}
		return result;
	}
	
	
	//memberDelete
	//Scanner로 id, pw만 입력 받기 -> MemberDTO 멤버변수에 추가
	//매개변수로 ArrayList를 받아서 입력받은 id와 pw 둘다 일치하는 인덱스를 찾아서 삭제
	public int memberDelete(ArrayList<MemberDTO> ar) {
		
		MemberDTO dto = new MemberDTO();
		System.out.println("검색할 ID를 입력하세요 : ");
		String mid = sc.next();
		dto.setId(mid);
		System.out.println("검색할 PW를 입력하세요 : ");
		String mpw = sc.next();
		dto.setPw(mpw);
		
		int result = 0;
		for(int i =0; i<ar.size(); i++) {
			if(mid.equals(ar.get(i).getId()) && mpw.equals(ar.get(i).getPw())) {
				ar.remove(i);
				result = 1;
				break;
			}
		}
		
		return result;
	}
	
	
	//memberAdd
	//Scanner로 id, pw, age를 입력 받음 -> 입력받은 데이터로 MemberDTO 멤버변수에 넣기
	//매개변수로 ArrayList를 받아서 생성한 MemberDTO를 추가	
	public void memberAdd(ArrayList<MemberDTO> ar) {
		
		MemberDTO dto = new MemberDTO();
		System.out.println("ID를 입력하세요 : ");
		dto.setId(sc.next());
		System.out.println("PW를 입력하세요 : ");
		dto.setPw(sc.next());
		System.out.println("AGE를 입력하세요 : ");
		dto.setAge(sc.nextInt());
		
		ar.add(dto);
		
	}
	
	//memberInit
	//info에 있는 정보를 , 기준으로 분리해서 MemberDTO 객체생성해서 대입
	//ArrayList에 각각 추가하고 리턴
	public ArrayList<MemberDTO> memberInit() {
		
		StringTokenizer st = new StringTokenizer(info, ",");
		ArrayList<MemberDTO> ar = new ArrayList<>();
		while(st.hasMoreTokens()) {
			MemberDTO dto = new MemberDTO();
			String id = st.nextToken();		
			dto.setId(id);
			String pw = st.nextToken();			
			dto.setPw(pw);
			int age = Integer.parseInt(st.nextToken());			
			dto.setAge(age);
			
			ar.add(dto); //ArrayList에 추가
			
		}
		
		return ar;
//		ArrayList<MemberDTO> ar = new ArrayList<>();
//		String [] list = info.split(",");
//		int k = -1;
//		for(int i=0; i<list.length/3; i++) {
//		MemberDTO dto = new MemberDTO();
//		dto.setId(list[++k]);
//		dto.setPw(list[++k]);
//		int a = Integer.parseInt(list[++k]);
//		dto.setAge(a);
//		ar.add(i, dto);
//		}
//		
//		for(int i=0; i<ar.size(); i++) {
//			System.out.println(ar.get(i).getId());
//			System.out.println(ar.get(i).getPw());
//			System.out.println(ar.get(i).getAge());	
//		}
//		return ar;
	}
}


		
		
	
	
	
	

