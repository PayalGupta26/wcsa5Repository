package java_program;

public class ConstructorOverloading {
	
	ConstructorOverloading()
	{
      System.out.println("no-argument");
	}
	
	
	ConstructorOverloading(int a)
	{  
		ConstructorOverloading obj=new ConstructorOverloading();//we can create object inside the constructor but we cant
		                                                        //call same constructor
         System.out.println(a);

		System.out.println("parametrized cons.");
	}
	
	
	public static void main(String[] args)
	   {
		
		ConstructorOverloading obj=new ConstructorOverloading(50);
		
	   }

}
