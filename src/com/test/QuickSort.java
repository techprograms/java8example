package com.test;

import java.util.Arrays;

public class QuickSort {

	private static void swap(int[] arr, int firstIndex, int secondIndex) {
		int temp = arr[firstIndex];
		arr[firstIndex] = arr[secondIndex];
		arr[secondIndex] = temp;
	}

	private static int pivot(int[] arr, int pivotIndex, int endIndex) {
		int swapIndex = pivotIndex;
		for (int i = pivotIndex + 1; i <= endIndex; i++) {
			if (arr[i] < arr[pivotIndex]) {
				swapIndex++;
				swap(arr, swapIndex, i);
			}
		}
		swap(arr, pivotIndex, swapIndex);
		return swapIndex;
	}

	public static void quickSort(int[] arr, int left, int right) {
		if (left < right) {
			int pivotIndex = pivot(arr, left, right);
			quickSort(arr, left, pivotIndex - 1);
			quickSort(arr, pivotIndex + 1, right);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 4, 6, 1, 7, 3, 2, 5 };
		quickSort(arr, 0, 6);
		// int returnedIndex = pivot(arr, 0, 6);
		// System.out.println("Returned Index: " + returnedIndex);
		System.out.println(Arrays.toString(arr));
	}
}