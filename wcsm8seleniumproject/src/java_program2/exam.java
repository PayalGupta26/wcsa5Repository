package java_program2;

public class exam extends test{
	
	char grade='a';
	
	public void result()
	{
		System.out.println("pass");
	}
	
	public static void main(String[] args) {
		
		exam obj=new exam();
		
	   System.out.println(obj.grade);
	   System.out.println(obj.marks);
	   obj.result();
	   obj.unit_Test();
	}

}
