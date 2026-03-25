package day2;

import java.util.Scanner;

public class Program2_PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		
		if(num==0)
		{
			System.out.println("Zero");
		}
		else if(num>0)
		{
			System.out.println("Positive");
		}
		else if(num<0)
		{
			System.out.println("Negative"); 
			
		}
		
		
		
	}

}
