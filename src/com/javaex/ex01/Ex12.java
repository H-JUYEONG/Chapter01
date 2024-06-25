package com.javaex.ex01;

public class Ex12 {

	public static void main(String[] args) {

		int a = 5;
		int b = 7;

		System.out.println("&&연산자--------");
		System.out.println(true && true); // T && T= T
		System.out.println(true && false); // T && F = F
		System.out.println(false && true); // F && T = F
		System.out.println(false && false); // F && F = F

		System.out.println("||연산자--------");
		System.out.println(true || true); // T || T= T
		System.out.println(true || false); // T || F = T
		System.out.println(false || true); // F || T = T
		System.out.println(false || false); // F || F = F

		System.out.println("!연산자--------");
		System.out.println(!true); // !T= T
		System.out.println(!false); // !F = T

		System.out.println("응용--------");
		boolean result = a < b && a > b;
		System.out.println(result);
		
		System.out.println(true && false || true);
		System.out.println(true || false || true);
		
	}

}
