package com.javaex.ex01;

public class Ex09 {

	public static void main(String[] args) {

		/*
		 1) 5/4 --> 정수/정수 -> 정수
		 2) 1을 실수형에 담는다 1--> 1.0
		 */
		double v01 = 5 / 4;
		System.out.println(v01);

		/*
		 1) (double)5 --> 5.0
		 2) 5.0 / 4 --> 5.0 / 4.0(자동형변환)
		 3) 5.0 / 4.0 --> 1.25
		 4) 1.25 --> double
		 */
		double v02 = (double) 5 / 4;
		System.out.println(v02);

		//위 문제와 같음
		double v03 = 5 / (double) 4;
		System.out.println(v03);

		double v04 = (double) 5 / (double) 4;
		System.out.println(v04);

		int v05 = (int) 1.3 + (int) 1.8;
		System.out.println(v05);

	}

}