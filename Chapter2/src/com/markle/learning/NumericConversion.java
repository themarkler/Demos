/**
 * 
 */
package com.markle.learning;

/**
 * @author rich
 *
 */
public class NumericConversion {

	/**
	 * Tests various numeric type assignments
	 */
	public static void main(String[] args) {
		int i;
		long L;
		double d;

		d = 4.555555555;
		System.out.println("D before cast: " + d);
		i = (int) d;
		System.out.println("D after cast: " + d);

		int sum = (int)d;
		sum += 5.5;
		System.out.println("Sum after implicit cast: " + sum);

		L = 1333333333;
		int k  = (int)L ;
		float f = (float)L;
		System.out.println(L + " stuffed into a float is: " + f);
		i = (int) (sum + L + d);
		System.out.println("Value of expression of: " + sum + " + " + 
							k + " + " + d + " is " + i);
		
	}

}
