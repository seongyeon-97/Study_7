package com.iu.s4.io.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite1 {
	
	public void write2() {

		Scanner sc= new Scanner(System.in);
		System.out.println("ID 입력");		
		String id = sc.next();
		
		System.out.println("PW 입력");		
		String pw = sc.next();
		
		System.out.println("AGE 입력");		
		int age = sc.nextInt();
		
		File file = new File("c:\\Users\\creat\\javaH\\workspace", "member.txt");

		try {
			FileWriter fw = new FileWriter(file, true);
			fw.write(id+ "\n\r");
			fw.write(pw+ "\n\r");
			fw.write(age+ "\n\r");
			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	public void write() {
		Scanner sc= new Scanner(System.in);
		File file = new File("c:\\Users\\creat\\javaH\\workspace", "test.txt");
		System.out.println("메세지를 입력하세요");
		String massage = sc.nextLine();
		
		try {
			FileWriter fw = new FileWriter(file, true);
			fw.write(massage+ "\n\r");
			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
