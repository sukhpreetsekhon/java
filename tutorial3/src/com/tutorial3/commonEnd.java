package com.tutorial3;

import java.util.Scanner;

public final class commonEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		commonEnd common=new commonEnd();
		
		int j;
		System.out.println("enter the size of first array:");
		int i=scan.nextInt();
		int[] a=new int [i];
		System.out.println("enter the values of first array:");
		for( j=0;j<i;j++)
		{
			a[j]=scan.nextInt();
		}
		int k;
		System.out.println("enter the size of second array:");
		int l=scan.nextInt();
		int[] b=new int [l];
		System.out.println("enter the values of second array:");
		for( k=0;k<l;k++)
		{
			b[k]=scan.nextInt();
		}
		System.out.print("a[]=");
		for( j=0;j<i;j++)
		{
		System.out.print(" "+a[j]);
		}
		System.out.println(",");
		System.out.print("b[]=");
		for( k=0;k<l;k++)
		{
		System.out.print(" "+b[k]);
		}
		System.out.println(",");

		System.out.println("output is:"+common.compare(a,b));

	}
	public boolean compare(int[] a,int[] b)
	
	{
		if((a.length>0 && b.length>0) && (a[0]==b[0]||a[a.length-1]==b[b.length-1]))
		{
			return true;
		}
		else {
			
			return false;
		}
		
	}

}
