package java_program;

public class College {
	
	public static void main(String[] args) {
		 
		Teacher obj=new Teacher("payal",25000);
		
		System.out.println(obj.get_Tsal());
		
		obj.set_Tsal(30000);
		System.out.println(obj.get_Tsal());
	}

}


