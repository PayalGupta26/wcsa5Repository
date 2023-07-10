package javaAssignments;//multiple inheritance

 public class mobile implements Instagram,WhatsApp
{
	  public void PostStory()
	 {
		 System.out.println("post-story on insta");
		 
	 }
	  
	  
	 public void SendMsg()
	 {
		 System.out.println("send msg to frnd");
	 }
	 
	 
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
