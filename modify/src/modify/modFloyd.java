package modify;

import java.util.Scanner;

public final class modFloyd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner s = new Scanner(System.in);
		int n,k=0,num;
		System.out.println("Enter number of lines you want in triangle:");
		n = s.nextInt();
		System.out.println("Floyd's triangle");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				k++;
				num=k%2;
				System.out.print(num);
				
				
				
			}
			
			
			System.out.println();
			
			
			
			
		}
		

	}

}
