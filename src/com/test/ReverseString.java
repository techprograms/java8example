package com.test;

public class ReverseString {
	public static void main(String[] args) {
		String testString = "Bharat";
		String revStr = "";
		for (int i = testString.length() - 1; i >= 0; i--) {
			revStr = revStr + testString.charAt(i);
		}
		System.out.println("Reverse String is: " + revStr);
	}
}
