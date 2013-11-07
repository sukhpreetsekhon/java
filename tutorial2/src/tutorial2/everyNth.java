package tutorial2;

import java.util.Scanner;

public final class everyNth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		everyNth every= new everyNth();
		System.out.println("Enter the string:");
		String s=scan.nextLine();
		System.out.println("Enter the value :");
		int val=scan.nextInt();
		System.out.println(every.charNth(s,val));
		

	}
	public String charNth(String ss,int v)
	{
		
		int lnght=ss.length();
		String str="";
		for(int i=0;i<=lnght;i+=v)
		{
			
	 str+=ss.charAt(i);
	
			
		}
		return str;
		
	}

}
