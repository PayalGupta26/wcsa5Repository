package java_program2;

public class demo {
	
	demo(double b)
	{ 
		this();
		System.out.println("demo()");
	}
	
	demo(int a)
	{ 
		
		System.out.println("demo1()");
	}
     
	demo()
	{
		this('a');
		System.out.println("demo2()");
	}
  
	public static void main(String[] args) {
		 
		demo obj=new demo(75.5);
		 
	}

}
