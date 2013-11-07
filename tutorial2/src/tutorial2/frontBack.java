package tutorial2;

import java.util.Scanner;

public final class frontBack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		frontBack fb=new frontBack();
		System.out.println("Enter the string:");
		String s=scan.nextLine();
		 System.out.println(fb.frntbck(s));
		

	}
	public String frntbck(String ss)
	{
		 int lngth=ss.length();
		char frst=ss.charAt(0);
		char last=ss.charAt(lngth-1);
		String str=ss.substring(1, lngth-1);
		return last+str+frst;
		
		
	}

}
