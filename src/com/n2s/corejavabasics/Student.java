package com.n2s.corejavabasics;

public class Student {
	int rollno;
	String name;
	int age;
	static String collegename = "SRS";

	public Student(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	void display() {
		System.out.println("StudentRollno:" + rollno + "StudentName:" + name + "StudentAge" + age
				+ "Studentcollegename:" + collegename);
	}
}
