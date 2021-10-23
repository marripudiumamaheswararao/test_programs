package com.test;

/*
 * This program is to find of sum of digits which are present in a string which contains char 't'
 */
public class SumOfDigitsInString {

	public static void main(String[] args) {
		// String s = "tang42";//tang42 : 6
		//String s = "rang42";//rang42 : 0
		String s = "2tarang42";//2tarang42 : 8
		int count = 0;
		if (s.contains("t")) {
			for (Character c : s.toCharArray()) {
				if (Character.isDigit(c)) {

					count = count + Integer.parseInt(c.toString());
				}
			}
		}
		System.out.println(s + " : " + count);
	}

}
