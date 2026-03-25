package day2;

public class Program4_Find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='A';
		if(ch>='A'&&ch<='Z')
		{
			System.out.println("Uppercase");
		}
		else if(ch>='a' && ch <='z')
		{
			System.out.println("LowerCase");
		}
		else if(ch>='0' && ch<='9')
		{
			System.out.println("Digit");
		}
		else
		{
			System.out.println("Special Charecter");
		}
		
	}

}
