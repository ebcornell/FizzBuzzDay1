package com.helloworld;

public class FizzBuzzBang2 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 110; i++) {
			
			if (((divisibleByThree(i) && divisibleByFive(i) && divisibleBySeven(i)))) {
				System.out.println("FizzBuzzBang");
					
				} else if ((divisibleByThree(i) && divisibleByFive(i))) {
					System.out.println("FizzBuzz");
					
				} else if  ((divisibleByFive(i) && divisibleBySeven(i))) {
					System.out.println("BuzzBang");
					
				} else if ((divisibleByThree(i) && divisibleBySeven(i))) {
					System.out.println("FizzBang");
					
				} else if (divisibleByThree(i)) {
					System.out.println("Fizz");
					
				} else if (divisibleByFive(i)) {
					System.out.println("Buzz");
					
				} else if (divisibleBySeven(i)) {
					System.out.println("Bang");
					
				} else {
					System.out.println(i);
				}
		}

	} //main
	
	public static boolean divisibleByThree(int i) {
		return ((i % 3) == 0);		
	}
	
	public static boolean divisibleByFive(int i) {
		return ((i % 5) == 0);
	}
	
	public static boolean divisibleBySeven(int i) {
		return ((i % 7) == 0);
	}

} //class
