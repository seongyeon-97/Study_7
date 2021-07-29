package com.iu.s2.list.ex12;

import java.util.ArrayList;

public class MyList implements DataIO {

	//dataoi 구현
		//add 오버라이딩 num을 list 맨 앞에 추가
		//remove list에서 무조건 마지막 요소를 삭제
	
	@Override
	public void add(ArrayList<Integer> ar, int num) {
		
		ar.add(0, num);
		
	}

	@Override
	public void remove(ArrayList<Integer> ar) {
		
		ar.remove(ar.size()-1);
		
	}
	
	
	
}
