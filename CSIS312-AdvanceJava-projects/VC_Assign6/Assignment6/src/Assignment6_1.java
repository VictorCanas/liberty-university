/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vscanas
 */
public class Assignment6_1 {
    
// Fig. 18.3: FactorialCalculator.java
// Recursive factorial method.

    // recursive method factorial (assumes its parameter is >= 0
    static StringBuilder s = new StringBuilder();

    public static long factorial(long number) {
        if (number == 0) // test for base case
        {
            return 1; 
        } else {// recursion step         
            if (s.length() == 0) {
                s.append(number).append("*").append(number - 1);
            } else {
                for (int i = 0; i < s.length(); i++) {
                    System.out.print(" ");
                }
                System.out.println("Recursive call:" + number + " * " + (number - 1) + "!");
                s.append("*").append(number).append("*").append(number - 1);
            }
            return number * factorial(number - 1);
        }
    }

    // output factorials for values 0-21
    public static void main(String[] args) {
        // calculate the factorials of 0 through 20
        System.out.println("Victor Canas - CSIS 312 - Assignment 6_1\n");
        for (int counter = 0; counter < 21; counter++) {
            s = new StringBuilder();
            System.out.println(counter  + "!");
            System.out.printf("%d! = %d%n", counter, factorial(counter));
        }
    }
} // end class FactorialCalculator
