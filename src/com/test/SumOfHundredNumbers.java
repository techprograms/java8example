package com.test;

import java.util.stream.IntStream;

public class SumOfHundredNumbers {

	public static void main(String[] args) {

		/* Imperative Approach */
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			sum += i;
		}
		System.out.println("Sum Using Imperative Approach: " + sum);

		/* Declarative Approach */

		int sum1 = IntStream.rangeClosed(0, 100).parallel().sum();

		System.out.println("Sum Using Declarative Approach: " + sum);
	}

}
