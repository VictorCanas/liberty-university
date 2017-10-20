//<Programming Assignment 2 - Program 2>
//Asks user for their name and outputs a welcome text with a random scripture
//CSIS 212-001
//Victor Canas

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner; // program uses class Scanner 

public class Program_2 {
	static Random random = new Random(); 
	public static void main(String[] args)
	{
		System.out.println("Victor Canas - Program 2\n");
		Scanner input = new Scanner(System.in);
		
		String name;
		System.out.print("Please enter your name: ");
		name = input.next();
		
		List<String> verses = new ArrayList<>();
		verses.add("Jeremiah 29:11");
		verses.add("Psalm 23");
		verses.add("1 Corinthians 13:4-8");
		verses.add("Philippians 4:13");
		verses.add("John 3:16");
		verses.add("Romans 8:28");
		verses.add("Isaiah 41:10");

//		for (String verse : verses) {
//			System.out.println(verse);
//		}
		
		int whichVerseToGet = random.nextInt(verses.size());
//		System.out.println(whichVerseToGet);
		
		String verse = verses.get(whichVerseToGet);
	
		System.out.printf("Welcome, %s%s", name,", to the Thrive Church website!\n");
		System.out.printf("The Scripture for the day is: %s", verse);

	}
}