package hybridinheritance;

import javaAssignments.Instagram;
import javaAssignments.WhatsApp;
import javaAssignments.mobile;

public class Mobile  extends WhatsApp implements Instagram{
	
	//method call from webapp interface
//	public void browser()
//	{
//		System.out.println("insta and whatsapp runs on browser");
//	}

	//method implimentaion given for insta interface
	 public void PostStory()
	 {
		 System.out.println("post-story on insta");
		 
	 }
	  
	  
//	
	 
	 
	 public static void main(String[] args) {
		 //obj create for own class and call method of parent class
		 mobile obj=new mobile();
		 obj.PostStory();
		 obj.SendMsg();
		 
		 
		 //upcasting from mobile to insta 
		 Instagram insta=obj;
		 insta.PostStory();
		 
		 
		 //upcasting from mobile to whatsapp
		 WhatsApp WA=obj;
		 WA.SendMsg();
		 
		
	  }
	

}
