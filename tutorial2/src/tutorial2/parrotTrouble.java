package tutorial2;

import java.util.Scanner;

public final class parrotTrouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		parrotTrouble trouble= new parrotTrouble();
		System.out.println("Enter the hour:");
		float a=scan.nextFloat();
		int hr=Math.round(a);
		System.out.println("we are in trouble:"+trouble.trouble(hr));

	}
	public boolean trouble(int t)
	{
		return (t<=7||t>=20);
		
	}
	

}
