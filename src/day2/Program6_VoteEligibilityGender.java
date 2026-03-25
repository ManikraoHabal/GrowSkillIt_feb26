package day2;

public class Program6_VoteEligibilityGender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=18;
		char gender='m';
		if(age==18) 
		{
			System.out.println("Congrats on your first Vote");
			if(gender=='f')
			{
				System.out.println("Please Vote Girl");
			}
			else
			{
				System.out.println("Please Vote Boy");
			}
		}
		if(age>=18)
		{
			System.out.println("Youn Can Vote");
		}
		else
		{
			System.out.println("You Cannot Vote");
		}
	}

}
