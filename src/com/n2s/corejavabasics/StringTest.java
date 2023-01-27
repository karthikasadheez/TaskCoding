package com.n2s.corejavabasics;

public class StringTest {

	public static void main(String[] args) {
		String s1 = "Java is an object oriented programming language";
		String s2 = "Author name is James gosling";
		System.out.println("length of the string1: " + s1.length());
		System.out.println("length of the string2: " + s2.length());

		String letterToFind = "a";
		int start = s1.indexOf(letterToFind);
		int counter = 0;
		while (start != -1) {
			counter++;
			System.out.println("Index position of :" + start);
			start = s1.indexOf(letterToFind, ++start);
		}
		System.out.println("Number of occurence of " + letterToFind + " in String: " + counter);

		System.out.println("Is s1 equals s2? : " + s1.equals(s2));
	}
}