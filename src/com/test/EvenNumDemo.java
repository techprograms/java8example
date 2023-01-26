package com.test;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EvenNumDemo {
	public static List<Integer> filterEvenNum(List<Integer> list) {
		Predicate<? super Integer> evenPredicate = n -> n % 2 == 0;
		List<Integer> evenNumList = list.stream()
				                        .filter(evenPredicate)
				                        .collect(Collectors.toList());
		return evenNumList;
	}

	public static void main(String[] args) {
		List<Integer> list = List.of(5, 2, 6, 4, 8, 7, 9, 10);
		List<Integer> evenNum = filterEvenNum(list);
		System.out.println(evenNum);
	}
}