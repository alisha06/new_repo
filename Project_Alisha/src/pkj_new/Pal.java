package pkj_new;

import java.util.Scanner;
class Pal
{  
 public static void main(String args[]){  
  int r,sum=0,temp,n;   
  Scanner s= new Scanner (System.in);
  n= s.nextInt();
  //int n=454;//It is the number variable to be checked for palindrome  
  
  temp=n;    
  while(n>0){    
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}  