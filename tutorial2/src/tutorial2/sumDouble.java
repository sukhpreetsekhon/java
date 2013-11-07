package tutorial2;

import java.util.Scanner;

public final class sumDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		sumDouble sumD=new sumDouble();
		
		System.out.println("Enter the first number:");
		int num1=scan.nextInt();
		
		System.out.println("Enter the  second number:");
		int num2=scan.nextInt();
		
		System.out.println("Answer is:"+ sumD.sum(num1, num2));
	
		
	}
	
	public int sum(int a,int b)
	{
		int sum=a+b;
	if(a==b)
	{
		 sum=2*sum;
		return sum;
		
	}
	else
	{
		
		return sum;
		
	}
		
	}

}
