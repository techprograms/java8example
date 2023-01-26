package com.test;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class OddNumberDemo {
	public static List<Integer> filterEvenNum(List<Integer> list) {
		Predicate<? super Integer> evenPredicate = n -> n % 2 != 0;
		List<Integer> oddNumList = list.stream()
				                        .filter(evenPredicate)
				                        .collect(Collectors.toList());
		return oddNumList;
	}

	public static void main(String[] args) {
		List<Integer> list = List.of(5, 2, 6, 4, 8, 7, 9, 10);
		List<Integer> oddNum = filterEvenNum(list);
		System.out.println("List of odd numbers : " + oddNum);
	}
}
