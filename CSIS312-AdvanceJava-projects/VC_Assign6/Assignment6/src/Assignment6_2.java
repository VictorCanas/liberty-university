/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vscanas
 */
import java.util.Random;
public class Assignment6_2 {
 
    public static void printArray(int[] a, int index) {
        if (index >= a.length) {
            System.out.println();
            return;
        } else {
            System.out.print(a[index] + " ");
            printArray(a, index + 1);
        }
    }
    
    public static void main(String[] args) {        
        Random random = new Random(System.currentTimeMillis());
        int[] a = new int[100]; // create an array of size 100
        System.out.println("Victor Canas - CSIS 312 - Assignment 6_2\n");
        System.out.println("Array of 100 that is filled by elements:");
        for (int i = 0; i < 100; i++) {
            a[i] = 1 + random.nextInt(100); // random number between 1 and 100 inclusive
        }
        printArray(a, 0);// call recursive method to displays all the elements in an array
    }
    
}
