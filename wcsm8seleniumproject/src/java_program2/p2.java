package java_program2;

public class p2 extends p1
{
	
	int b=25;
	
	p2()
	{
		super(97);
		System.out.println("P2()");
		
	}
	
	public static void main(String[] args) {
		
		p2 obj=new p2();
		
		System.out.println(obj);
	}

}
