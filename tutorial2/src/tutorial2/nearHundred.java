package tutorial2;

import java.util.Scanner;

public final class nearHundred {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nearHundred near=new nearHundred();
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the number:-");
		int number=scan.nextInt();
		
		System.out.println(near.nrHundred(number));
		

	}
	
	public boolean nrHundred(int num)
	{
		if((Math.abs(100-num)<=10) || (Math.abs(200-num)<=10))
		{
			
		return true;
		}
		return false;
		}
			
		
		
	}


