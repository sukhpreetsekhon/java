package com.tutorial4;

public final class constructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	time objectNull=new time();
	time objectOne=new time(4);
	time objectTwo=new time(2,4);
	time objectThree=new time(12,23,02);
	 System.out.printf("%s\n", objectNull.output());
	 System.out.printf("%s\n", objectOne.output());
	 System.out.printf("%s\n", objectTwo.output());
	 System.out.printf("%s\n", objectThree.output());
	

}
}
class time

{
	private int hours;
	private int mins;
	private int sec;
	
	public time()
	{
		
		this(0,0,0);
	}
	public time(int h)
	{
		
		this(h,0,0);
	}

	public time(int h, int m)
	{
		
		this(h,m,0);
	}

	public time(int h, int m,  int s)
	{
		
		setTime(h,m,s);
	}
	public void setTime(int h, int m,  int s)
	
	{
		setHour( h);
		setMin( m);
		setSec( s);
	}
	public void  setHour(int h )
	{
		if(h>=1 && h<24)
		{
			hours=h;
		}
		else{hours=0;}
		
	}
	public void setMin(int m)
	{
		if(m>=1 && m<60){
	mins=m;
		}
		else{mins=0;}
	}
	public void setSec(int s)
	{
		if(s>=1 && s<60){
		sec=s;
		}
		else{sec=0;}
	}
	public int getHour()
	{
		return hours;
	}
	public int getMins()
	{
		return mins;
	}
	public int getSec()
	{
		return sec;
	}
	public String output()
	{
		return String.format("%02d:%02d:%02d",  getHour(), getMins(), getSec());
	}
	
	
}





