package com.javaex.ex01;

public class Ex03 {

	public static void main(String[] args) {

		// long은 int범위까지는 그냥 쓸 수 있다.
		// int범위를 벗어나면 뒤에 L을 붙여야한다.
		// long 사용시 항상 뒤에 L을 붙이는게 좋다.
		long no = 2147483648L;
		System.out.println(no);
	}

}