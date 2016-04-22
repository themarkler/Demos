package com.markle.learning;

public class AugmentedOperators {

	public static void main(String[] args) {
		// Demos the different augmented operators
		
		double d1 = 12;
		System.out.println("D1 is: " + d1);
		double d2 = d1+= 1;
		System.out.println("D2 +=1: " + d2);
		d2 = d2-=1;
		System.out.println("After -=1: " + d2);
		d2 = d2 /= 2;
		System.out.println("After /=: " + d2);
		d2 = d2 *= 2;
		System.out.println("After *=: "  + d2);
		

	}

}
