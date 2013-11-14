package com.tutorial3;

import java.util.Scanner;

public final class sameFirstlast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		sameFirstlast same=new  sameFirstlast();
		
		int j;
		System.out.println("enter the size of an array:");
		int i=scan.nextInt();
		int[] array=new int [i];
		System.out.println("enter the values of an array:");
		for( j=0;j<i;j++)
		{
			array[j]=scan.nextInt();
			
			
		}
		
		for( j=0;j<i;j++){
		System.out.print(" "+array[j]);
		}
		System.out.println("");

	System.out.println(	"output is:"+ same.compare(array));
		

	}

	public boolean compare(int[] array)
	{
		
		if(array.length>0 && array[0]==array[array.length-1])
		{
			return true;
	}
		else {
			return false;
		}
		}
		
		
	}
	

