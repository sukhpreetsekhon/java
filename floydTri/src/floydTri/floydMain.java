package floydTri;
import java.util.Scanner;

public final class floydMain {
	
	public static void main(String[] arg){
		Scanner s = new Scanner(System.in);
		int n, num=1;
		System.out.println("Enter number of lines you want in triangle:");
		n = s.nextInt();
		System.out.println("Floyd's triangle");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(num+" ");
				num++;
				
				
			}
			
			System.out.println();
			
			
			
			
		}
		
		
		
		
		
		
		
	}
	
	

}
