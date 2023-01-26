package com.test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class RemoveDuplicateElements {
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(2, 3, 4, 3, 5, 7, 3, 1);		
		List<Integer> unique = intList.stream()
				.distinct()
				.sorted()
				.collect(Collectors.toList());
		System.out.println("List of Unique Elements : "+unique);
	}
}
