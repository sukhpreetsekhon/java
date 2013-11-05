package number;

import java.util.Scanner;

public final class numberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		numberMain num= new numberMain(); 
		System.out.println("Enter the number:");
		int a=scan.nextInt();
		System.out.println("1.number is odd/even" );
		num.oddEven(a);
		System.out.println("2.number is palindrome or not:");
		num.palindrome(a);
		
		System.out.println("3.number is prime or not:");
		num.prime(a);
		
		System.out.println("4.number is pythagoras triplet or not:");
		
		System.out.println("5.reverse of number is:");
		num.reverseNo(a);
		
		

	}
	
	public void oddEven( int b)
	{
	if(b%2==0)
	{
		System.out.println(" even");
	}
	else{
		
		System.out.println(" odd");
	}	
		
	}
	
	public boolean prime(int b)
	{
		
		for(int i=2;i<=b/2;i++)
		{
			if(b%i==0)
			{
				System.out.println("No");
				return false;
				
			}
			
		}
		
			System.out.println("yes");
			return true;
			
		
	}
	
	
	public void palindrome(int b)
	{
		
		
		int rev=0;
		
		while((b!=0))
		{
			rev=rev*10+b%10;
			b=b/10;
		
		}
		if(rev==b)
			{System.out.println("yes"+ b + "is");}
		else
		
			{System.out.println("no"+ b + "is not");}
			
		
		
		
		
	}
	public void reverseNo(int b)
	{
		
		int rev=0;
		while(b!=0)
		{
			
			rev=rev*10+b%10;
			b=b/10;
			
		}
		
System.out.println(rev);
	}
	
	
	

}
