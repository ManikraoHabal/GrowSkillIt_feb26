package assignments;

public class PercentageCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sub1=56;
		int sub2=66;
		int sub3=76;
		int sub4=86;
		int sub5=96;
		
		if(sub1<33 || sub2<33 || sub3<33 || sub4<33 ||sub5<33)
		{
			System.out.println("Result : Fail");
			System.out.println("Grade : F");
		}
		else
		{
			System.out.println("Result is : Pass");
			int total=sub1+sub2+sub3+sub4+sub5;
			int percentage=total/5;
			System.out.println("Percentage is :"+percentage);
			if(percentage>=90)
			{
				System.out.println("Grade is : A+");
			}
			else if(percentage>=75 || percentage<=89 )
			{
				System.out.println("Grade is : A");
			}
			else if(percentage>=60 || percentage<=74)
			{
				System.out.println("Grade is : B");
			}
			else if(percentage>=50 || percentage<=59)
			{
				System.out.println("Grade is : C");
			}
			else if(percentage>=33 || percentage<=49)
			{
				System.out.println("Grade is : D");
			}
		}
		
		
		
	}

}
