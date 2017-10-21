/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vscanas
 */
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

//Write a program that inserts 25 random integers from 0 to 100 in order into a LinkedList object. 
public class Assign_5_1 {

    public static void main(String[] args) {
        
        Random random = new Random();
        
        List<Integer> list = new LinkedList<Integer>();
        
        System.out.println("Victor Canas - CSIS 312 - Assignment 5_1\n");
        
        System.out.println("Random 25 integer numbers from 0 to 100");
        
        //
        for (int i = 0; i < 25; i++) {
            int number = random.nextInt(101);
            list.add(number);
            System.out.print(number + " ");
        }
        
        System.out.println("\nSort the list of 25 numbers");
        
        //sort the elements
        Collections.sort(list);
        
        for (int number : list) {
            System.out.print(number + " ");
        }
        
        System.out.println();
        int sum = 0;
        for (int number : list) {
            sum += number;
        }
        //calculate the sum of the elements
        System.out.println("Sum of the elements: " + sum);
        
        //calculate the floating-point average of the elements
        System.out.println("Average floating-point of elements: " + ((float) sum / 25.0));
    }
}
