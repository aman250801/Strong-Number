package com.aman;

public class StromgNumber {
	

	    // Method to calculate the factorial of a number
	    public static int factorial(int num) {
	        int fact = 1;
	        for (int i = 1; i <= num; i++) {
	            fact *= i;
	        }
	        return fact;
	    }

	    // Method to check if a number is a Strong number
	    public static boolean isStrongNumber(int number) {
	        int originalNumber = number;
	        int sum = 0;

	        // Extract each digit and calculate the factorial
	        while (number > 0) {
	            int digit = number % 10;
	            sum += factorial(digit);
	            number /= 10;
	        }

	        // Compare the sum to the original number
	        return sum == originalNumber;
	    }

	    public static void main(String[] args) {
	        int number = 135; // You can change this to any number you want to check

	        if (isStrongNumber(number)) {
	            System.out.println(number + " is a Strong number.");
	        } else {
	            System.out.println(number + " is not a Strong number.");
	        }
	    }
	}



