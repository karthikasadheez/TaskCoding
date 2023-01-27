package com.n2s.corejavabasics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String continueFlag;

		do {
			System.out.println("Enter your Name: ");
			String name = sc.next();
			names.add(name);
			System.out.println("The name list: " + names);
			System.out.println("Do you want to continue? (y/n): ");
			continueFlag = sc.next();
		} while ("y".equals(continueFlag));
		System.out.println("Exit");
	}

}
