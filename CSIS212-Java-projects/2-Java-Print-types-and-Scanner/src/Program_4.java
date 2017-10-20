//<Programming Assignment 2 - Program 4>
//Ask the user to enter 2 integers, obtains them from the user 
//and prints their sum, product, difference and quotient (division). 
//CSIS 212-001
//Victor Canas

import java.util.Scanner;
public class Program_4 {
	
	public static void main(String[] args)
	
	{
		Scanner inp = new Scanner(System.in);
		int number1, number2, sum,  product, difference, quotient;
		
		System.out.println("Victor Canas - Program 4\n");
		
		System.out.print("Enter first integer: "); 
		number1 = inp.nextInt(); 
		
		System.out.print("Enter second integer: ");
		number2 = inp.nextInt(); 
		
		sum = number1 + number2;
		product = number1 * number2;
		difference = number1 - number2;
		quotient = number1 / number2;
	
		System.out.printf("%n");
		System.out.printf("Sum is %d%n", sum);
		System.out.printf("Product is %d%n", product);
		System.out.printf("Difference is %d%n", difference);
		System.out.printf("Quotient is %d%n", quotient);
	}
}