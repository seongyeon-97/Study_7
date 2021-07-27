package com.iu.s2.token;

import java.util.StringTokenizer;

public class TokenMain3 {

	public static void main(String[] args) {
		
		String str1 = "korea-usa-france"; //-> split가 편함
		String [] s = str1.split("-");
		for(int i=0; i<s.length; i++) {
			Nation n = new Nation();
			n.setName(s[i]);
		}
		
		StringTokenizer st = new StringTokenizer(str1, "-");
		while(st.hasMoreTokens()) {
			String name = st.nextToken();
			Nation n = new Nation();
			n.setName(name);
		}
		
		//이름하고 가격이 한 쌍
		String str2 = "note10-100-iphone12-130-zflip-300"; //->Tokennizer가 편함
		StringTokenizer st2 = new StringTokenizer(str2, "-");
		while(st2.hasMoreTokens()) {
			Phone phone= new Phone();
			phone.setName(st2.nextToken());
			phone.setPrice(st2.nextToken());
			System.out.println(phone.getName());
		}
		//split
		
//		String [] strs = str2.split("-");
//		for(int i=0; i<strs.length; i++) {
//			Phone phone = new Phone();
//			phone.setName(strs[i]);
//			phone.setPrice(strs[++i]);
//		}
		
		
	}

}
