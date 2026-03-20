package day2;

public class Program2_TypeCasting {
	public static void main(String[] args)
	{	
		//up casting = implicit type conversion
		int val=32;
		float val2=val;
		System.out.println(val2);
		
		int n=100;
		long n1=n;
		System.out.println(n1);
		
		
		
		//downcasting = explicit type conversion
		float height = 162.5f;
		int heightInt = (int) height;
		System.out.println(heightInt);
		
		
		long phno=98765432102l;
		int phno1=(int)phno;
		System.out.println(phno1);
	}
}
