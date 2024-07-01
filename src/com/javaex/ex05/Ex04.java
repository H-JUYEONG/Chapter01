package com.javaex.ex05;

public class Ex04 {

	public static void main(String[] args) {

		int[] arr = new int[3];
		
		arr[0] = 3;
		arr[1] = 6;
		arr[2] = 9;

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("-----------------------------");
		
		arr[0]=13;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		/* 없는 배열 방을 찾아갈 경우
		for (int i = 0; i <= arr.length; i++) {
			System.out.println(arr[i]);
		}
		*/
	}

}
