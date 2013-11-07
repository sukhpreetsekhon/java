package tutorial2;
import java.util.Scanner;

public final class negativePositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num1=0,num2 = 0;
		boolean third = false;
		System.out.print("Enter the number 1 : ");
		num1 = s.nextInt();
		System.out.print("Enter the number 2 : ");
		num2 = s.nextInt();
		System.out.print("Enter the flag (true/false) : ");
		third = s.nextBoolean();
		negativePositive np=new negativePositive();
		
		System.out.println("Result is : " +np.NegativePositive(num1,num2,third) );

	}
	
	public boolean NegativePositive(int a,int b,boolean c)
	{
		
	if(((a<0 && b>0)||(a>0 && b<0)) && !c)	
	{
		return true;
		
	}
		
	else if (a<0 && b<0 && c) 
	{
		
		return true;
	}
	else
		return false;
	
	}

}
