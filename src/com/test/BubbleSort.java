package com.test;

public class BubbleSort {

	public static void sortElement(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 7, 1, 9, 3 };
		int length, temp;
		length = arr.length;
		// Bubble Sorting
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (arr[i] > arr[j]) {
					// Swap the element
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		sortElement(arr);
	}
}
