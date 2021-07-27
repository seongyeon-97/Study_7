package com.iu.s2.token;

import java.util.StringTokenizer;

public class TokenMain2 {

	public static void main(String[] args) {
		
		String str = "korea-usa-china*france*uk - canada-germany";
		
		str = str.replace("*", "-");		
		StringTokenizer stt = new StringTokenizer(str, "-");
				
		while(stt.hasMoreTokens()) {
			String s = stt.nextToken();
			System.out.println(s.trim().toUpperCase());
		}
		
	}

}
