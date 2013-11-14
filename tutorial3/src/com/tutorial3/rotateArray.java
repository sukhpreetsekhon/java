package com.tutorial3;
import java.util.Scanner;
public final class rotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan=new Scanner(System.in);
    rotateArray rotate=new rotateArray();
		
		int [] array=new int[3];
		System.out.println("enter the values of an array[]:");
		for(int i=0;i<3;i++)
		{
			array[i]=scan.nextInt();
			
		}
		System.out.println("");
		System.out.print("array[] before rotation=");
		for(int i=0;i<3;i++)
		{
			
			System.out.print(array[i]+",");
		}
		System.out.println("");
		int[] reverse=rotate.reverse(array);
		System.out.print("array[] after rotaton=");
		for(int i=0;i<3;i++)
		{
			
			System.out.print(reverse[i]+",");
		}
		
	
	}
	public int[] reverse(int[] array)
	{
	int[] a={array[2],array[1],array[0]};	
	return 	a;
	}

}
