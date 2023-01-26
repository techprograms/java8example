package com.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CountDuplicateNum {
	
	public static Set<Integer> findDuplicateCount(List<Integer> list) {
		Set<Integer> numSet = new HashSet<Integer>();
		Set<Integer> result = list.stream().filter(n -> !numSet.add(n))
				                           .collect(Collectors.toSet());
		return result;
	}

	public static void main(String[] args) {
		List<Integer> list = List.of(5, 2, 6, 4, 8, 7, 9, 10, 4, 5, 7);
		findDuplicateCount(list).forEach(System.out::println);
	}
}
