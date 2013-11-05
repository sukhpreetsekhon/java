package valueOf_Y;

import java.util.Scanner;

public final class valueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		
		valueMain val= new valueMain();
		System.out.println("Value of Y depends upon value of X");
		System.out.println("Value of x is: ");
		int x= scan.nextInt();
		int p=val.ifelse_Y(x);
		System.out.println("therefore ifelse value of y is: " + p);
		
		

	}
	
	public int ifelse_Y(int b)
	{
		int s;
		if (b>0)
		{s=1;}
		else if(b==0)
		{s=0;}
		else
		{s=-1;}
		return s;
		
	}
	
}
