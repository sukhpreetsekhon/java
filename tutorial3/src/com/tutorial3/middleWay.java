package com.tutorial3;
import java.util.Scanner;

public final class middleWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		middleWay middle=new middleWay();
		int j;
		System.out.println("enter the size of an arrays:");
		int i=scan.nextInt();
		int[] a=new int [i];
		System.out.println("enter the values of first array:");
		for( j=0;j<i;j++)
		{
			a[j]=scan.nextInt();
		}
		
		
		int[] b=new int [i];
		System.out.println("enter the values of second array:");
		for( j=0;j<i;j++)
		{
			b[j]=scan.nextInt();
		}
		System.out.print("a[]=");
		for( j=0;j<i;j++)
		{
		System.out.print(" "+a[j]);
		}
		System.out.println("");
		System.out.print("b[]=");
		for( j=0;j<i;j++)
		{
		System.out.print(" "+b[j]);
		}
		System.out.println("");
		int [] add=middle.sum(a,b);

		System.out.println("output is:");
		for( j=0;j<i;j++)
		{
		System.out.print(" "+add[j]);
		}
		

	}
	public int[] sum(int[] a,int[] b)
	{
	int [] add=new int[a.length];
	for(int i=0;i<a.length;i++)
	{
		add[i]=a[i]+b[i];
		
	}
	return add;
		
	}
	
	

}
