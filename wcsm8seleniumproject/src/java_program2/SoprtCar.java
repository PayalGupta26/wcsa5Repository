package java_program2;

public class SoprtCar extends car {
	
	 public void transport()
    {
	System.out.println("nano its a small car");
    }
	 
	 public static void main(String[] args) {
		
		 SoprtCar obj=new SoprtCar();
		 
		 obj.transport();
		 
		 car c=obj;
		 
		 c.transport();
		 
		 vehical v=c;
		 v.transport();
		 
	}

}