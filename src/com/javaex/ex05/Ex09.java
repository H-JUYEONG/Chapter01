package com.javaex.ex05;

public class Ex09 {

	public static void main(String[] args) {

		// C:\javaStudy\workspace\Chapter01\bin>java com.javaex.ex05.Ex09 -version

//		if (args[0].equals("-version")) {
//			System.out.println("1.0");
//		} else if (args[0].equals("-help")) {
//			System.out.println("도움말");
//		}

		// C:\javaStudy\workspace\Chapter01\bin>java com.javaex.ex05.Ex09 나는 황주영 입니다.
//		System.out.println(args[0]);
//		System.out.println(args[1]);
//		System.out.println(args[2]);

		/*
		 * 결과: 나는 황주영 입니다.
		 */

		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}

	}

}
