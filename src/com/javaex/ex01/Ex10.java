package com.javaex.ex01;

//클래스
public class Ex10 {

	// 메소드
	public static void main(String[] args) {

		// 대입연산자 =
		int a = 7;
		int b = 2;

		System.out.println(a);
		System.out.println(b);

		System.out.println("-------------------------");

		// 산술연산자
		int sum = a + b;
		System.out.println(sum);
		System.out.println(a + b); // +
		System.out.println(a - b); // -
		System.out.println(a * b); // *
		System.out.println(a / b); // / --> 몫
		System.out.println(a % b); // % --> 나머지

		// 산술연산자 -> 자세히
		System.out.println(7 / 2); // 결과:3
		System.out.println(7.0 / 2); // 결과:3.5
		System.out.println(7.0 / 2.0); // 결과:3.5

		System.out.println("-------------------------");

		// 부호연산자
		int var = -3;
		int pVar = +var;
		int mVar = -var;
		System.out.println(pVar); // +(-3) --> -3
		System.out.println(mVar); // -(-3) --> +3
		
		System.out.println("-------------------------");
		
		//증감연산자(전위,후위)
		System.out.println(++a);
		System.out.println(a);
		
		System.out.println(--b);
		System.out.println(b);
		
		System.out.println("-------------------------");
		
		System.out.println(a++);
		System.out.println(a);
		
		System.out.println(b++);
		System.out.println(b);
		
		System.out.println("-------------------------");
		
		int c = 5;
		System.out.println(++c*2);
		
		int d = 5;
		System.out.println(d++*2);
	}

}
