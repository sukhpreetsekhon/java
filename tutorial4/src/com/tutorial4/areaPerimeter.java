package com.tutorial4;


 class squareArea
{
	private double side;	
	public void setSide(double side)
	{
		
	this.side=side;	
	}
	public double getArea()
	{
		double s=side*side;
		return s;
		 
	}
	public double getPerimeter()
	{
		//double p=4*side;
		return 4*side;
		
	}
	

}
 
 
 class rectangle
 
 {
	private double length;
	private double breadth;
	 public void setLength(double length)
	 {
		 
		 this.length=length;
		 
	 }
	 public void setBreadth(double breadth)
	 {
		 
		 this.breadth=breadth;
		 
	 }
	 public  double getLenght()
	 {
		 
		 return length;
	 }
	 public  double getBreadth()
	 {
		 
		 return breadth;
	 }
	 public double getArea()
	 {
		 double area=length*breadth;
		 return area;
		 
	 }
	 public double getPerimeter()
	 {
		 double perimeter=2*(length+breadth);
		 return perimeter;
		 
	 }
	 
	 
	 
 }
class triangle
{
	
private double base;
private double height;
public void  setBase(double base)
{
this.base=base;	
}
public void setHeight(double height)
{
	
this.height=height;
}

public double getbase()
{
	
return base;
}
public double getheight()
{
return height;	
}


public double getArea()
{
return 0.5*base*height;	
}


}



class circle
{
	
private double radius;
public void setRadius(double radius)
{
	
this.radius=radius;

}
public double getRadius()
{
	
return radius;
}
	
public double getArea()
{
	
return 3.14*radius*radius;
}
	
public double getPerimeter()
{
	
return 2*(3.14*radius);

}
	
}

public final class areaPerimeter {
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//areaPerimeter square=new areaPerimeter();
		areaPerimeter square=new areaPerimeter();
		squareArea sq= new squareArea();
		sq.setSide(6);
	        double area=sq.getArea();
			double perimeter=sq.getPerimeter();
			System.out.println("Area of Square is:"+area);
			System.out.println("preimeter of square  is:"+perimeter);
			
			rectangle rect= new rectangle();
			rect.setLength(20);
			rect.setBreadth(18);
			area=rect.getArea();
			perimeter=rect.getPerimeter();
			
			System.out.println("Area of rectangle is:"+area);
			System.out.println("preimeter of rectangle  is:"+perimeter);
			
		triangle triangle=new triangle();
		triangle.setHeight(12);
		triangle.setBase(8);
		area=triangle.getArea();
		System.out.println("Area of triangle is:"+area);
		
		circle circle=new circle();
		circle.setRadius(7);
		area=circle.getArea();
		perimeter=circle.getPerimeter();
		System.out.println("Area of circle is:"+area);
		System.out.println("preimeter of circle  is:"+perimeter);
		
		

	}
	
	

}



	
	
	
	



