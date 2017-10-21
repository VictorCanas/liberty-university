/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vscanas
 */
public class PairTest {
	
	public static void main(String[] args) {
                // Pair p1 takes Integer and String types as a pair
		Pair<Integer, String> p1 = new Pair<Integer, String>();
                System.out.println("Victor Canas - CSIS 312 - Assignment 7\n");
                System.out.println("p1 takes Integer and String types as a pair");
		p1.setFirst(1);
		p1.setSecond("String");
                if (p1.getFirst() != 1 || !p1.getSecond().equals("String")) {
                    System.out.println("Error");
                } else {
                    System.out.println("First: " + p1.getFirst());
                    System.out.println("Second: " + p1.getSecond());
                }
                
                // Pair p1 takes Integer and String types as a pair
                Pair<String, Integer> p2 = new Pair<String, Integer>();
                System.out.println("p2 takes String and Integer");
		p2.setFirst("String");
		p2.setSecond(2);
                if (p2.getSecond() != 2 || !p2.getFirst().equals("String")) {
                    System.out.println("Error");
                } else {
                    System.out.println("First: " + p2.getFirst());
                    System.out.println("Second: " + p2.getSecond());
                }
	}

}

