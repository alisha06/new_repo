package pkj_new;
import java.util.Scanner;

public class Factorial

{
	public void factorial (int a)
	{
		int num=1;
		
		for (int i =a ; i>=1 ; i-- )
		{
		 num=num*i;
		}
			System.out.println("factorial is "+num);
		
		
	}

		public static void main(String[] args) 
		{
		Factorial obj = new Factorial();
		Scanner s= new Scanner (System.in);
		System.out.println("Enter value of a=");
		int a=s.nextInt();
		obj.factorial(a);
		}
}
