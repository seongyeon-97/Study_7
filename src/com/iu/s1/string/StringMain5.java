package com.iu.s1.string;

import java.util.Scanner;

public class StringMain5 {

	public static void main(String[] args) {
		
		String n = "Hello World";
		String n2 = n.replace('e', 'o');
		System.out.println(n);
		System.out.println(n2);
		
		String n3 = n.substring(n.indexOf('W'));
		System.out.println(n3);
		
		System.out.println("--------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("저장할 파일 명을 입력하세요.");
		String name = sc.nextLine();
		
		String [] files = {"jpg", "gif", "png", "svg"};
		
		int idx = name.lastIndexOf('.');
		String n4 = name.substring(idx+1);
		System.out.println(n4);
		
		boolean flag = false;
		
		for(int i=0; i<files.length; i++) {
			if(n4.equals(files[i])) {
				flag = true;
				break;
			}	
		}
		if(flag == true) {
			System.out.println("이미지 파일입니다.");
		}else {
			System.out.println("이미지 파일이 아닙니다.");
		}

	}

}
