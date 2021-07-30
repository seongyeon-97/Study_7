package com.iu.s3.exception;

public class Exception_2 {

	public static void main(String[] args) {
		
		Test1 test1 = new Test1();
		try {
			test1.t1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("예외처리 시작");
			//e.printStackTrace();
			System.out.println("예외처리 종료");
			
		}
		
//		int [] ar = {1,2,3};
//		
//		Test2 test2 = new Test2();
//		try {
//			test2.t2(ar);
//		} catch (ArrayIndexOutOfBoundsException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

}
