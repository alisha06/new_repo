package pkj_new;
import java.util.Scanner;
public class prime1 {
	public static void main(String[] args) 
	
	{
	int a=32;
	int half=a/2;
	int n=0;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number");
	a=scan.nextInt();
	
	for (int i=2;i<=half;i++)
	{
		if (a%i==0)
		{
			System.out.println("Prime");
			n=1;
			break;
		}
		
		if(n==0)
		{
			System.out.println("not prime");
		}
	}
	}
	}


