package tutorial2;

import java.util.Scanner;

public final class lastDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		lastDigit lst=new lastDigit();
		
		System.out.println("Enter the first number:");
		int num1=scan.nextInt();
		
		System.out.println("Enter the  second number:");
		int num2=scan.nextInt();
		
		System.out.println(lst.compare(num1,num2));

	}
	
	public boolean compare(int a,int b)
	{
		int lastfirst=a%10;
		int lastsecond=b%10;
		if(lastfirst==lastsecond)
		{
			
			return true;
		}
		return false;
				
	}

}
