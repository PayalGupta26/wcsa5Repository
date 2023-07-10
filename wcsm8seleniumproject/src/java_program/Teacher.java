package java_program;

public class Teacher {
	
	private String Tname;
	private double Tsal;
	
	//getter method
	public double get_Tsal() 
	{
		return this.Tsal;
	}
	
	//setter method
	public void set_Tsal(double sal) 
	{
	  this.Tsal=sal;  
	}
	
	//constructor to initialize the value
	Teacher(String name,double sal)
	{
		this.Tname=name;
		this.Tsal=sal;
	}
	
	//non static method 
	public  void T_details()
	{
		System.out.println(this.Tname);
		System.out.println(this.Tname);
    }
	
	


}
