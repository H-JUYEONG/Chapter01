package com.javaex.ex02;

public class Ex01 {

	public static void main(String[] args) {

		System.out.println("안녕");
		System.out.println("하세요");

		System.out.print("안녕");
		System.out.println("하세요");

		System.out.println("--------------------");

		int i = 2345;
		double d = 3.14;
		char c = '한'; // 실제값을 가지고 있다
		String s = "한"; // 주소를 가지고 있다
		String str = "굿모닝";
		String name = "황주영";

		System.out.println(str);
		System.out.println(str + name + str);
		System.out.println(i + i); // 정수+정수
		System.out.println(i + d);// 정수+실수 = 정수->실수(자동형변환)
		System.out.println(str + i);

		String str2 = str + i; // 문자열+숫자(실수,정수) --> 문자열

		System.out.println("제이름은 " + '"' + name + '"' + "입니다."); // 큰 따옴표
		System.out.println("제이름은 \"" + name + "\"입니다."); // 큰 따옴표
		System.out.println("제이름은 \\" + name + "\\ 입니다."); // 역슬래쉬
		System.out.println("제이름은 \t" + name + "\t 입니다."); // 탭(Tab)
		System.out.println("제이름은 \n" + name + "\n입니다."); // 줄바꿈
	}

}
