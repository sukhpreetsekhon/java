package com.tutorial3;
import java.util.Scanner;
 public final class rotateLeft 
 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan =new Scanner(System.in);
		rotateLeft rotate=new rotateLeft();
		int [] array=new int[3];
		System.out.println("enter the values of an array[]:");
		for(int i=0;i<3;i++)
		{
			array[i]=scan.nextInt();
			
		}
		System.out.print("array[] before rotation=");
		for(int i=0;i<3;i++)
		{
			
			System.out.print(array[i]+",");
		}
		System.out.println("");
	

        System.out.print("array[] On left rotation=");
       
		System.out.print(array[1]+","+array[2]+","+array[0]);
		
		}
}
