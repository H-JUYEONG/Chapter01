package com.javaex.ex05;

public class Ex06 {

	public static void main(String[] args) {

		// char형일때
		char[] ch = new char[3];

		ch[0] = 'a';
		ch[1] = 'b';
		ch[2] = 'c';

		// 입력
		for (int i = 0; i < ch.length; i++) {
			int charCode = 65 + i;
			ch[i] = (char) charCode;
		}

		// 출력
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}

	}

}
