package depreciation;

import java.util.Scanner;

public final class MainDep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		MainDep dep= new MainDep();
		System.out.println("Calculate depreciation of an oject");
		
System.out.print("Enter the cost price of an product:");
int cp=scan.nextInt();
System.out.print("Enter the estimated salvage price of an product:");
int salvg=scan.nextInt();
System.out.print("Enter the year of service of an product:");
int year=scan.nextInt();
int depreciation=(cp-salvg)/year;
System.out.print("Depreciation for an object is:"+ depreciation);

	}

}
