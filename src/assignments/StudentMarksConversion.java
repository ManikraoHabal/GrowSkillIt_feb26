package assignments;

public class StudentMarksConversion {

	/*
	 * Problem 1: Student Marks Conversion System Problem Statement: A student
	 * scored 87.6 marks in an exam (stored in a float). Perform the following
	
	 * operations:
	 * Convert the float marks into: 
	 * double,  int Print all three values. 
	 * Convert the final integer value into a character using ASCII and print it.
	 * 
	 * Expected Learning:
	 * 
	 * Float â†’ Double (Upcasting) 
	 * Double â†’ Int (Downcasting) 
	 * Int â†’ Char (ASCII conversion)
	 
	 * Sample Output:
	  
	 * Float value: 87.6 
	 * Double value: 87.6 
	 * Integer value: 87 
	 * Character value: W
	 */
	public static void main(String[] args) {

		float marks=87.6f;
		
		double m1=marks;
		int m2=(int)m1;
		char ch=(char)m2;
		
		System.out.println("Float value: "+marks);
		System.out.println("Double value: "+m1);
		System.out.println("Integer value: "+m2);
		System.out.println("Character value: "+ch);
				
	}

}
