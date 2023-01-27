package com.n2s.corejavabasics;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {

		String Employeename;
		String Employeeemail;
		String EmployeeDesignation;
		final int count = 5;

		Scanner s = new Scanner(System.in);

		for (int i = 1; i <= count; i++) {
			System.out.println("Enter the value for employee :" + i);

			System.out.println("Enter Employee name:");
			Employeename = s.nextLine();

			System.out.println("Enter Employee Email:");
			Employeeemail = s.nextLine();

			System.out.println("Enter Employee Designation:");
			EmployeeDesignation = s.nextLine();

			System.out.println("Employee  details: "+i);
			System.out.println("Employee  name is: " + Employeename);
			System.out.println("Employee  email is: " + Employeeemail);
			System.out.println("Employee  Designation is: " + EmployeeDesignation);
		}
		System.out.println("stop adding details Maximum employee lists are reached");
		s.close();
	}

}
