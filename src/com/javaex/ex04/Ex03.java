package com.javaex.ex04;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("단을 입력해주세요");

		System.out.print("단 : ");
		int dan = sc.nextInt();

//		for (int i = 1; i <= 9; i++) {
//			System.out.println(dan + " * " + i + " = " + dan * i);
//		}

		int time = 1;
		for (int i = 0; i < 9; i++) {
			System.out.println(dan + " * " + time + " = " + dan * time);
			time++;
		}
		
		sc.close();
	}

}
