////<Programming Assignment 3 - Exercise 3.19 JHTP (Sales Commission Calculator)>
//Inputs one salesperson’s items sold last and calculates and displays that sales person’s earnings.  
//CSIS 212-001
//Victor Canas

import java.util.Scanner;

public class Sales_3_19 {

	public static void main(String[] args)
	
	{
	
		System.out.println("Victor Canas - Sales Commission Calculator\n");
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number sold of product #1: "); //ask the user for items sold of product #1 
		int number1 = input.nextInt();
		double item1 = number1 * 239.99; 
		
		System.out.print("Enter number sold of product #2: "); //ask the user for items sold of product #2
		int number2 = input.nextInt();
		double item2 = number2 * 129.75; 
		
		System.out.print("Enter number sold of product #3: "); //ask the user for items sold of product #3
		int number3 = input.nextInt();
		double item3 = number3 * 99.95; 
		
		System.out.print("Enter number sold of product #4: "); //ask the user for items sold of product #4
		int number4 = input.nextInt();
		double item4 = number4 * 350.89; 
		
		System.out.print("Enter number sold of product #5: "); //ask the user for items sold of product #5
		int number5 = input.nextInt();
		double item5 = number5 * 50.89; 
		
		
		int numberSold = (int) (item1 + item2 + item3 + item4 + item5);
		double gross = numberSold * 0.09;
		double totalGross = gross + 200;
		
		System.out.printf("Your total earnings are $%.2f%n", totalGross ); //outputs the total earnings 
		
	}	
}
