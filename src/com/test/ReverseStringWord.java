package com.test;

public class ReverseStringWord {
	public static String reverseStringWords(String str) {
		String words[] = str.split(" ");
		String reverseWord = "";
		for(String w : words) {
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			reverseWord += sb.toString() + " ";
		}
		return reverseWord;
	}
	public static void main(String[] args) {
		
		String str = "This is Great India";
		StringBuilder sb = new StringBuilder(str);
		StringBuilder rev = sb.reverse();
		System.out.println(rev);
	}
}
