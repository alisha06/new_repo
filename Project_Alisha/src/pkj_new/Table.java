package pkj_new;

import java.util.Scanner;

public class Table {
	public void table (int a) {
	System.out.println(" output is ");
	
for (int i = 1; i<=10; i++)
{
int num= a*i;
System.out.println(""+num);
}
	}
public static void main(String[] args) 
{
Table obj = new Table();
Scanner s= new Scanner (System.in);
System.out.println("Enter value of a=");
int a=s.nextInt();
obj.table(a);
}
}