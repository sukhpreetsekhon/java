package com.myPackage;
import javax.swing.JOptionPane;
public class ProgramWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProgramWorld pro = new ProgramWorld();
		pro.myMethod();
	}

	public  void  myMethod() {
		System.out.print("MY WORLD!!!!!");
		int i=JOptionPane.showConfirmDialog(null, "HEllo My WORLD!!");
		int l=JOptionPane.showConfirmDialog(null, "i"+i);
		Double a=Math.random();
		String k=""+a;
		int s=JOptionPane.showConfirmDialog(null, ""+k);
		
	}

}
