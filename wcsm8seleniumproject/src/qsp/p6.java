package qsp;

public class p6 {
	
	p6()
	{
		System.out.println("p6()");
	}
	
	
	p6(int a)
	{  
		p6 obj1=new p6();

		System.out.println(obj1);
		System.out.println(a);
    }

	

	public static void main(String[] args) {
      p6 obj=new p6(98);
		
	}

}
 