package day3;

public class Program5_Tableof2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=2;
		int j=1;
		while(j<=15)
		{	
			
			int k=i*j;
			
			if(k%3==0 && k%10==0)
			{
				System.out.println("Bye"+"("+k+")");
				
			}
			else if(k%3==0)
			{
				System.out.println("Hello"+"("+k+")");
			}
			else if(k%10==0)
			{
				System.out.println("Bye"+"("+k+")");
			}
			else
			{
				System.out.println(k);
			}
			j++;
		}
		
	}

}
