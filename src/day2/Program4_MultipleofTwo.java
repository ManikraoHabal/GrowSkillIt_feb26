package day2;

public class Program4_MultipleofTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		if(num%2==0 && num%10!=0)
		{
			System.out.println("Multiple of 2");
		}
		else if(num%10==0)
		{
			System.out.println("Multiple of 10");
		}
		else
		{
			System.out.println("Not Multiple of 2");
		}
	}

}
