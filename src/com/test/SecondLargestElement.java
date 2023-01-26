package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class SecondLargestElement {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 3, 4, 2, 5, 5, 5, 6, 8);
		Optional<Integer> element = list.stream()
										.sorted(Collections.reverseOrder())
										.distinct().skip(1).findFirst();
		if (element.isPresent()) {
			System.out.println("Second Largest Element: " + element.get());
		}
	}
}
