package com.n2s.corejavabasics;

public class Animal {

	public void eat() {
		System.out.println("I can eat");
	}

	public void sleep() {
		System.out.println("I can sleep");
	}
}

class Dog extends Animal {
	public void bark() {
		System.out.println("I can bark");

	}
}