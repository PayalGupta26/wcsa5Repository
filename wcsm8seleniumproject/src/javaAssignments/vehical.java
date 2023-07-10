package javaAssignments;

//multiple inheritance by using interface and abstract class

public class vehical extends Car implements Jeep {
	
	public void Electrohydrolic()
	{
		System.out.println("jeep compass is electohydralic");
	}
	
	public void AutomatedCar()
	{
		System.out.println("jaguar is an automated car");
	}
	
	public static void main(String[] args) {
		
		vehical obj=new vehical();
		obj.AutomatedCar();
		obj.Electrohydrolic();
		
		//upcasting from vehical to car
		
		Car ca=obj;
		ca.AutomatedCar();
		
		//upcasting from vehical to jeep
		Jeep jp=obj;
		jp.Electrohydrolic();
	}

}
