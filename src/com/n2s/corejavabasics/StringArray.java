package com.n2s.corejavabasics;

public class StringArray {

	public static void main(String[] args) {
		String s = "welcome to java learning";
		String strArr[] = s.split(" ");

		System.out.println("String" + s);

		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i] + " ");
		}

	}

}
