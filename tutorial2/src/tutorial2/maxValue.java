package tutorial2;

import java.util.Scanner;

public final class maxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		maxValue val=new maxValue();
		
		System.out.println("Enter the first number:");
		int num1=scan.nextInt();
		
		System.out.println("Enter the  second number:");
		int num2=scan.nextInt();
		
		System.out.println(val.compare(num1,num2));

		
		
	}
	public int compare(int x,int y)
	{
		if((x>=10)&(x<=20)&(y>=10)&(y<=20))
		{
			if(x>y)
				return x;
			else 
				return y;
			
			
		}
		else if((x>=10)&(x<=20)&!(y>=10)&(y<=20))
		{
			
			return x;
			
		}
		
		else if((y>=10)&(y<=20)&!(x>=10)&(x<=20))
		{
			
			return y;
			
		}
		else 
			return 0;
		
		
	}

}
