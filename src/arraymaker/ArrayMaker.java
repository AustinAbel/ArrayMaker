package arraymaker;

import java.util.Scanner;

/******************************************************************************
 * Program Filename: 	ArrayMaker.java
 * Author: 				Abel, Austin
 * Date: 				September, 2015
 * Description: 		The user will enter a number then the program will list
 *  					number one to the number they chose.
 * Input: 				The user's chosen number.
 * Output: 				The list of numbers.
 * 
******************************************************************************/


public class ArrayMaker {


	
	@SuppressWarnings("resource")
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		
		/* Asks the user for their chosen number */
		System.out.println("Pick a number.");
			int InOne = sc.nextInt();
		
		// Creates an integer array with a size dependent on the user's input.
		int[] ArrayOne = new int[InOne + 1];
			
			
		/* Iterates through each "spot" in the array placing the
		 *  corresponding number in it's correct spot. */
		for (int i = 1; i < InOne + 1; i++) {

			ArrayOne[i] = i;
			
			
			
		}
		
		/* Prints each number in the array 'ArrayOne' */
		for (int i = 1; i < ArrayOne.length; i++) {
			
			System.out.println(ArrayOne[i]);
			
		}
		
		
	}
			
}
