package com.iu.s4.io.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class FileReader1 {

	public static void main(String[] args) {
		
		File file = new File("c:\\Users\\creat\\javaH\\workspace", "name.txt");
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			ArrayList<FileMember> ar = new ArrayList<>();
			
			while(true) {
				String str = br.readLine();		
				if(str == null) {
					break;
				}
				FileMember fileMember = new FileMember();
				String [] members = str.split(",");
				fileMember.setId(members[0]);
				fileMember.setPw(members[1]);
				fileMember.setAge(Integer.parseInt(members[2]));
				ar.add(fileMember);
				System.out.println(str);
			}
			
			for(int i=0; i<ar.size(); i++) {
				System.out.println("ID : " + ar.get(i).getId());
				System.out.println("PW : "+ ar.get(i).getPw());
				System.out.println("AGE : "+ ar.get(i).getAge());
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
