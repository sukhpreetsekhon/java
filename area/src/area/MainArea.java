package area;

import java.util.Scanner;


public final class MainArea 
{
	
	public static void main(String[] args)
	    {
		// TODO Auto-generated method stub
		
		
		Scanner scanner=new Scanner(System.in);
		MainArea sel=new MainArea();
		
		System.out.println("Select the options below:");
		System.out.println("-----------------------------------------");
		System.out.println("1.Area of square.");
		System.out.println("2.Area of rectangle.");
		System.out.println("3.Area of Triangle. ");
		System.out.println("4.Area of circle.");
		System.out.println("5.Exit");
		
		int i=scanner.nextInt();
		
		 
		int area;
	
	 
		
		
		
		switch(i)
		{
		case 1:
			   System.out.println("entr the side of square:");
			   int sq= scanner.nextInt();
		    	 area=sq*sq;
		    	System.out.println("Area of square is:"+area);
		    	
		       break;
		case 2:
			   System.out.println("entr the lenght of rectangle:");
		       int len=scanner.nextInt();
		       System.out.println("entr the breadth of rectangle:");
		       int bdth=scanner.nextInt();
		       area=len*bdth;
		    	System.out.println("Area of rectangle is:"+area);
		    	
		     
		       break;
		case 3:
			   System.out.println("entr the base of triangle:");
			   double base=scanner.nextDouble();
			   System.out.println("entr the height of square:");
			   double alti=scanner.nextDouble();
			   double ar= 0.5*alti*base;
			    System.out.println("Area of triangle is:"+ar);
			   
			   break;
		case 4:
			System.out.println("entr the radius of circle:");
			double r= scanner.nextDouble();
			ar=r*r*3.14;
	    	
	    	System.out.println("Area of circle is:"+ar);
			break;
		case 5:
			System.exit(0);
		}

		
		
		
		
	
	
	
	
	
  
    
    
    
	    } 	
	    	
    	
    }
	



