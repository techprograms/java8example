package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OccurenceOfNumber {
	public static void main(String[] args) {
		List<Integer> lst = Arrays.asList(1, 2, 3, 1, 4, 1, 2, 4, 5);
		Map<Object, Long> duplicateCount = lst.stream()
				.collect(Collectors.groupingBy(n -> n, Collectors.counting()));		
		duplicateCount.forEach((k, v) -> System.out.println(k + " : " + v));
	}
}
