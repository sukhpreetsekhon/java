package elect_bill;

import java.util.Scanner;

public final class billMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		billMain bill=new billMain();
		System.out.println("Enter the units consumed:");
		double units=scan.nextDouble();
		double payment;
		if(units<100)
		{
			
			payment=units*1;
			System.out.println("Monthly Payment is:$ " + payment );
			
		}
		if(units>=100 && units<300)
		{
			payment=units*0.75;
			System.out.println("Monthly Payment is:$ " + payment );
			
			
		}
		if(units>=300 && units<500)
		{
			
			payment=units*0.50;
			System.out.println("Monthly Payment is:$ " + payment );
			
		}
		
		else if(units>=500)
		{
			
			payment=units*0.25;
			System.out.println("Monthly Payment is:$ " + payment );
			
		}

	}

}
