package tutorial2;

import java.util.Scanner;

public final class startHi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		startHi start=new startHi();
		System.out.println("Enter the string:");
		String s=scan.nextLine();
		 System.out.println(start.starthii(s));
		

	}
	
	public boolean starthii(String ss)
	{
		
		
		String str=ss.substring(0, 2);
		if(str.equals("hi") )
		{
		return true;	
			
		}
		return false;
		
	}

}
