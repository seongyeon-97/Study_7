package com.iu.s3.exception;

import java.util.Scanner;

public class Exception_1 {

	public static void main(String[] args) {
		System.out.println("start");
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		int num2 = 20;
		
		int num3 = num2 / num;
		System.out.println(num3);
		
		System.out.println("finish");
	}

}
