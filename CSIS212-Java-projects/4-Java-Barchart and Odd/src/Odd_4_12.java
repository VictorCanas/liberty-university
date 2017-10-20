//<Programming Assignment 4 - Exercise 4.12>
//Prints the product of odd integers from 1 to 15
//CSIS 212-001
//Victor Canas

public class Odd_4_12 {
	
	public static void main(String[] args)
	{
		int product = 1;
		 
		for (int x = 1; x <= 15; x += 2)
			product *= x;
		
		System.out.printf( "Product is %d\n", product);
		
	}

}
