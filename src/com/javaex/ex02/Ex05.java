package com.javaex.ex02;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("나이를 입력해주세요");
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		sc.nextLine(); // 숫자형 -> 문자형 입력시 버그가 있으므로 해당 코드 추가 필요
		
		System.out.println("이름을 입력해주세요");
		System.out.print("이름 : ");
		String name = sc.nextLine();

		System.out.println("당신의 이름은 " + name + " 나이는 " + age + " 입니다.");
		
		sc.close();
	}

}