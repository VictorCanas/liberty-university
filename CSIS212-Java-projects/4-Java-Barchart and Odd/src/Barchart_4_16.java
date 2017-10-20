//<Programming Assignment 4 - Exercise 4.16>
//Reads 5 numbers between 1 and 30 and prints it in form of "*"
//CSIS 212-001
//Victor Canas

import java.util.Scanner;

public class Barchart_4_16 {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner( System.in );
		
		int number1 = 0; 
		int number2 = 0; 
		int number3 = 0; 
		int number4 = 0; 
		int number5 = 0; 
		
		int inputNumber; // number that is entered by the user
		int starts = 0; // number of stars for the program to print
		int counter = 1; // counter for current number
		
		while ( counter <= 5 )
		{
		   System.out.print( "Please enter a number between 1-30: " );
		   inputNumber = input.nextInt();
		   if ( inputNumber >= 1 && inputNumber <= 30 )
		   {
		      switch ( counter )
		      {
		      case 1:
		         number1 = inputNumber;
		         break; 
		      case 2:
		         number2 = inputNumber;
		         break; 
		      case 3:
		         number3 = inputNumber;
		         break; 
		      case 4:
		         number4 = inputNumber;
		         break; 
		      case 5:
		         number5 = inputNumber;
		         break; 
		   } 
		   counter++;
		} 
		else
		      System.out.println("Invalid! Please enter a number between 1 and 30" );
		} 
		
	      for ( counter = 1; counter <= 5; counter++ )
	      {
	         switch ( counter )
	         {
	            case 1:
	               starts = number1;
	               break; 
	            case 2:
	               starts = number2;
	               break;
	            case 3:
	               starts = number3;
	               break;
	            case 4:
	               starts = number4;
	               break;
	            case 5:
	               starts = number5;
	               break;
	         }
	         for ( int j = 1; j <= starts; j++ )
	            System.out.print( "*" );
	         System.out.println();
	      } 
	}
}
