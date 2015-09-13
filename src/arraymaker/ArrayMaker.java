package arraymaker;

import java.util.Scanner;

/******************************************************************************
 * TODO Comment
 * 
 * 
 * 
 * 
******************************************************************************/


public class ArrayMaker {


	
	@SuppressWarnings("resource")
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		
		/* TODO Comment */
		System.out.println("Pick a number.");
			int InOne = sc.nextInt();
		
		// TODO Comment
		int[] ArrayOne = new int[InOne + 1];
			
			
		/* TODO Comment */
		for (int i = 1; i < InOne + 1; i++) {

			ArrayOne[i] = i;
			
			
			
		}
		
		for (int i = 1; i < ArrayOne.length; i++) {
			
			System.out.println(ArrayOne[i]);
			
		}
		
		
	}
			
}
