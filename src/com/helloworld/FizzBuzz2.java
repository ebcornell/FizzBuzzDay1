package com.helloworld;

public class FizzBuzz2 {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {

			if ((divisbleByThree(i) && divisibleByFive(i))) {
				System.out.println("FizzBuzz");

			} else if (divisibleByFive(i)) {
				System.out.println("Buzz");

			} else if (divisbleByThree(i)) {
				System.out.println("Fizz");

			} else {
				System.out.println(i);
			}

		}

	} // main

	public static boolean divisbleByThree(int i) {
		return ((i % 3) == 0);
	}

	public static boolean divisibleByFive(int i) {
		return ((i % 5) == 0);

	}

} // class
