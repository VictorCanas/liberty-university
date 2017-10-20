//<Programming Assignment 5 - Multiplicity 5.16>
//determines, for a pair of integers, whether the second integer is a multiple of the first. 
//CSIS 212-001
//Victor Canas
import java.util.Scanner; //Scanner 

public class Mul_5_16 
{
	//checks if the second number is a multiple of the first 
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
	
		int first; //the first number 
		int second;  // the second number
	
		System.out.print("Enter first number(0 to exit):"); //Ask user for first integer 
		first = input.nextInt();
		
		while (first != 0)
		{
			System.out.print("Enter second number:"); //Ask user for second integer 
			second = input.nextInt();
			
			if(isMultiple(first, second))
				System.out.printf("%d is a multiple of %d%n", second, first);
			else 
				System.out.printf("%d is not a multiple of %d%n", second, first);
			
			System.out.print("Enter first number(0 to exit):");
			first = input.nextInt();
		}
	}
	 public static boolean isMultiple (int x , int y)
	 {
			
         if(x % y == 0)
             return true;   
         else
             return false;
	 }
}


//Pseudocode

//Step 1 = Scanner
//Step 2 = Declare variables(2)
//Step 3 = Ask user for integer 
//Step 4 = while ( first !=0)
//Step 5 = Ask for second integer 
//Step 6 = nest if - else * use method here (multiple)
//Step 7 = Ask for first integer 
//Step 8 = write multiplied method - perform the calculation 

//Step 1 = Scanner
//Step 2 = Declare avariables (2) 
//call it isMultiple 
//Step 8 = write multiplied method - perform the calculation 
//public static boolean isMultiple( int x, int y) 

//Output 
//Enter first number (0 to exit): 3
//Enter second number: 9
//9 is a multiple of 3

//System out printf (put in second, first)   

