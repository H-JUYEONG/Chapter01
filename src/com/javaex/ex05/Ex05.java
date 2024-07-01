package com.javaex.ex05;

public class Ex05 {

	public static void main(String[] args) {

		int[] arr = new int[6];

		// 입력
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 45) + 1;
		}

		// 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}

	}

}
