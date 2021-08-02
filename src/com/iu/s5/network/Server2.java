package com.iu.s5.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Server2 {

	public static void main(String[] args) {
		ArrayList<String> lunch = new ArrayList<>();
		lunch.add("돈까스");
		lunch.add("참치김밥");
		lunch.add("냉모밀");
		lunch.add("모듬초밥");
		lunch.add("샌드위치");
		lunch.add("비빔밥");
		
		ArrayList<String> dinner = new ArrayList<>();
		dinner.add("오마카세");
		dinner.add("치킨");
		dinner.add("돼지바베큐");
		dinner.add("모듬곱창");
		dinner.add("흑돼지삼겹살");
		dinner.add("마라샹궈");
		
		//클라이언트 접속 준비
		//클라이언트와 접속 성공
		//클라이언트로부터 메세지 수신
		//1이면 점심메뉴중에서 하나 전송
		//2이면 저녁메뉴중에서 하나 전송
		//3이면 프로그램 종료
		
		Scanner scanner = new Scanner(System.in);
		ServerSocket ss=null;
		Socket sc = null;
		InputStream is=null;
		InputStreamReader ir=null;
		BufferedReader br=null;
		OutputStream os=null;
		OutputStreamWriter ow=null;
		BufferedWriter bw=null;
		Random random = new Random();
		try {
			ss = new ServerSocket(8282);
			System.out.println("Client 접속 기다리는 중");
			
			sc = ss.accept();
			System.out.println("Client와 연결 성공");
			boolean check = true;
			
			while(check) {
			is = sc.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			String message = br.readLine();
			System.out.println("클라이언트에서 보낸 메세지");
			System.out.println("Client : "+message);
			
			  if(message.equals("3")) {
		            System.out.println("연결 종료");
		            break;
		         }

			
//			System.out.println("클라이언트로 보낼 메세지 입력");
//			message = scanner.nextLine();
			if(message.equals("1")) {
			//message 클라이언트로 전송
				os = sc.getOutputStream();
				ow = new OutputStreamWriter(os);
				bw = new BufferedWriter(ow);		
				message = lunch.get(random.nextInt(6));
				bw.write(message+"\r\n");
				bw.flush();
			}else if(message.equals("2")) {
				os = sc.getOutputStream();
				ow = new OutputStreamWriter(os);
				bw = new BufferedWriter(ow);
				message = dinner.get(random.nextInt(6));
				bw.write(message+"\r\n");
				bw.flush();
			}
			
			if(message.toUpperCase().equals("3")) {
				check = false;
				continue;
			}
			
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				ow.close();
				os.close();
				br.close();
				ir.close();
				is.close();
				sc.close();
				ss.close();
				scanner.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
	}

}
