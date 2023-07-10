package java_program2;

public class B extends A {
	
	int b=25;
	
	public void demo()
	{
		System.out.println("demo()");
	}
	
	{
		System.out.println("ns_block2");
	}
	
	public static void main(String[] args) {
		
		B b1= new B();
		
		System.out.println(b1.a);
		System.out.println(b1.b);
		
		b1.demo();
		b1.test();
	}

}
