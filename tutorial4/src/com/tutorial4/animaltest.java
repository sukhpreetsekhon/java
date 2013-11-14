package com.tutorial4;

public final class animaltest {

	private static final String carniAge = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		carnivorous carnivor=new carnivorous();
		herbivorous herbi=new herbivorous();
		omnivorous omni=new omnivorous();
		carnivor.setName("tiger");
		carnivor.setAge(10);
		carnivor.setFood("carnivorous");
		herbi.setName("goat");
		herbi.setAge(4);
		herbi.setFood("herbivorous");
		omni.setName("bear");
		omni.setAge(7);
		omni.setFood("omnivorous");
		String carniName= carnivor.getName();
		int carniAge=carnivor.getAge();
		String carniFood=carnivor.getFood();
		
		String herbiName= herbi.getName();
		int herbiAge=herbi.getAge();
		String herbiFood=herbi.getFood();
		
		String omniName= omni.getName();
		int omniAge=omni.getAge();
		String omniFood=omni.getFood();
		
		System.out.println(carniName+" is "+ carniAge+" years old "+carniFood);
		System.out.println(herbiName+" is "+ herbiAge+" years old "+herbiFood);
		System.out.println(omniName+" is "+omniAge +" years old "+omniFood);
		

	}

}
 class animals {
	private String name;
	private int age;
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	

}
 class carnivorous extends animals
{
	
	private String food;
	public void setFood(String food)
	{
		this.food=food;
	}
	public String getFood()
	{
		return food;
	}
	
}

 class herbivorous extends animals
 {
	 private String food;
	 public void setFood(String food)
		{
			this.food=food;
		}
	 public String getFood()
		{
			return food;
		}
	 
 }
 
 class omnivorous extends animals
 {
	 private String food;
	 public void setFood(String food)
		{
			this.food=food;
		}
	 public String getFood()
		{
			return food;
		}
 }