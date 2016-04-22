package com.markle.learning;

import java.util.Scanner;

public class ComputeAverage {

	public static void main(String[] args) {
		//Get input numbers
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 3 numbers: ");
		Double num1 = input.nextDouble();
		Double num2 = input.nextDouble();
		Double num3 = input.nextDouble();
		
		Double average = (num1 + num2 + num3)/3;
		
		System.out.println("The average is: " + average);

	}

}
