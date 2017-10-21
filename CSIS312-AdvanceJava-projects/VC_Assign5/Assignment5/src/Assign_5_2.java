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
import java.util.Random;

//Write a program that creates a LinkedList object of 10 characters, 
//then creates a second LinkedList object containing a copy of the first list, 
//but in reverse order. Print out both LinkedList’s starting with the first list in list order.


public class Assign_5_2 {

    public static void main(String[] args) {
        
        //creates a LinkedList object
        char[] characters = new char[52];
        Random random = new Random();
        
        int index = 0;
        for (char a = 'a'; a <= 'z'; a++) {
            characters[index] = a;
            index++;
        }
        
        for (char b = 'A'; b <= 'Z'; b++) {
            characters[index] = b;
            index++;
        }
        
        //second LinkedList object containing a copy of the first list
        LinkedList<Character> list = new LinkedList<Character>();
        
        System.out.println("Victor Canas - CSIS 312 - Assignment 5_3\n");
        
        //print random
        System.out.println("Random 10 Characters");
        for (int i = 0; i < 10; i++) {
            char c = characters[random.nextInt(index)];
            list.add(c);
            System.out.print(c + "\n");
        }
        
        //print in reverse order
        System.out.println("Reverse Order");
        Collections.reverse(list);
        for (char c : list) {
            System.out.print(c + "\n");
        }
        System.out.println();
    }

}

