//<Programming Assignment 2 - Program 5>
//Reads 2 integers, determines whether the first is a multiple of the second and prints the result.
//CSIS 212-001
//Victor Canas

import java.util.Scanner;

public class Program_5 {

	public static void main(String[] args)
	
	{
		Scanner ip = new Scanner(System.in);
		int number1, number2, remainder;
		
		System.out.println("Victor Canas - Program 5\n");
		
		System.out.print("Enter first integer: "); 
		number1 = ip.nextInt(); 
		
		System.out.print("Enter second integer: ");
		number2 = ip.nextInt(); 
		
		remainder=number1%number2;
		
		if(remainder==0)
		{
			System.out.printf("%d is a multple of %d", number1, number2);
		}
		else {
			System.out.println("Not valid");
		}
	}
}
