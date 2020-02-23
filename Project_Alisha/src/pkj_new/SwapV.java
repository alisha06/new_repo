package pkj_new;

import java.util.Scanner;

public class SwapV {
	public void swap (int a, int b)
	
	{
		int c= a;
		a=b;
		b=c;
	System.out.println("value of a is " +a);	
	System.out.println("value of b is " +b);	
	}
	
	public static void main(String[] args)
	{
		SwapV obj= new SwapV();
		Scanner s= new Scanner (System.in);
		System.out.println("Enter value of a=");
		int a= s.nextInt();
		System.out.println("Enter value of b=");
		int b= s.nextInt();
		obj.swap(a, b);
		
	}
	

}
