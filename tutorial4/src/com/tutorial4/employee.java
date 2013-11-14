package com.tutorial4;

public final class employee {
	
	
	private String fname;
	private String lname;
	private int id;
	private int age;
	private double salary;
	
	public void setFname(String fname)
	{
		this.fname=fname;
	}
 public void setlname(String lname)
{
this.lname=lname;	
}
public void setID(int id)
{this.id=id;
	
}
public void setAge(int age)
{
this.age=age;	
}
public void setSalary(int salary)
{
this.salary=salary;	
}
      public String getFname()
      {
    	  return fname;
    	  
      }
      
      public String getLname()
      {
    	  return lname;
    	  
      }
      public int getID()
      {
    	  
    	  return id;
    	  
      }
      public int getAge()
      {
    	  return age;
    	  
      }
      public double getSalary()
      {
    	  return salary;
    	  
      }
      
      public  void display(String Fname,String Lname,int id,int age,double salary )
      {
    	  
    	System.out.println("Employer's First name:"+Fname);
    	System.out.println("Employer's last name:"+Lname);
    	System.out.println("Employer's Age:"+age);
    	System.out.println("Employer's Salary:"+salary);
    	System.out.println("Employer's Id:"+id);
    	  
      }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		employee emp=new employee();
		emp.setFname("sukh");
		emp.setlname("sekhon");
		emp.setAge(23);
		emp.setSalary(5000000);
		emp.setID(101);
		String Fname=emp.getFname();
		String Lname=emp.getLname();
		int age=emp.getAge();
		int id=emp.getID();
		double salary=emp.getSalary();
		
emp.display( Fname,Lname, id, age, salary );
	}

}
