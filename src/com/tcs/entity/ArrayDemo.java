package com.tcs.entity;

import java.util.Arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		enhanchedForLoop();
		//arrayDemo();
	}

	private static void enhanchedForLoop() {
		// TODO Auto-generated method stub
		int[] numbers = { 1, 4, -8, 6, 3 };
		for (int number : numbers) {
			if (number % 2 == 0) {
				System.out.println(number);
			}
		}
	}

	private static void arrayDemo() {
		int[] numbers = new int[10];
		numbers[0] = 3;
		numbers[4] = 1;
		Arrays.sort(numbers, 0, numbers.length);
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}
