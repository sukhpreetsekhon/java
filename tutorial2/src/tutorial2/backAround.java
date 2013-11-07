package tutorial2;

import java.util.Scanner;

public final class backAround {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		backAround back=new backAround();
		System.out.println("Enter the 1 or more character word:-");
		String s=scan.nextLine();
		 System.out.println(back.backAround1(s));
		
		}
	
	
	public String backAround1(String ss)
	{
		
		int lgth =ss.length();
		char lastwrd=ss.charAt(lgth-1);
		return lastwrd+ss+lastwrd;
	
	}
	
	

}
