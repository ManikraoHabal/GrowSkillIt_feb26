package assignments;

import java.util.Scanner;

public class ASCIIExplorer {

	/*
	 * Problem 2: ASCII Explorer
	
	 * Problem Statement: Write a Java program that:
	 * Takes a character input from the user (e.g., 'A'). 
	 * Finds and prints its ASCII value. 
	 * Adds 5 to the ASCII value. 
	 * Converts the new value back to a character and prints it.
	 
	 * Expected Learning:
	 
	 * Char â† Int conversion (ASCII) Arithmetic operations on ASCII values Int â†’
	 * Char typecasting

	 * Sample Input:
	 * Enter character: A
	 
	 * Sample Output:
	 * ASCII value: 65 
	 * New ASCII value: 70 
	 * New character: F
	 */

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the character: ");
		char ch=sc.next().charAt(0);
		
		System.out.println("Entered Charecter is : "+ch);
		
		//int value=(int)ch;
		System.out.println("ASCII Value : "+asciiconverter(ch));
		
		//value=value+5;
		int value=asciiconverter(ch)+5;
		System.out.println("New ASCII value: "+value);
		
		//char ch1=(char)value;
		System.out.println("New character: "+charconverter(value));
	}
		
	public static int asciiconverter(char ch)
	{
		int value=(int)ch;
		return value;
	}
		
	public static char charconverter(int value)
	{
		char ch1=(char)value;
		return ch1;
	}
}	
