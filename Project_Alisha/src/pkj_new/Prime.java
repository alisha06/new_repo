package pkj_new;
import java.util.Scanner;


public class Prime {
	
	public void prime (int a) 
	{
		System.out.println(" output is ");
		
	for (int i = 2; i<=a; i++)
	{
		int temp = a%i;
		
		
	if (temp==0)
	System.out.println("prime number");
	
	else
		System.out.println("Not Prime");
		}
		}
	public static void main(String[] args) 
	{
	Prime obj = new Prime();
	Scanner s= new Scanner (System.in);
	System.out.println("Enter value of a=");
	int a=s.nextInt();
	obj.prime(a);
	}
	}
