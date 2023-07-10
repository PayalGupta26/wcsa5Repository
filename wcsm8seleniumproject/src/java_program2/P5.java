package java_program2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;


public class P5 {

	  

	public static void main(String[] args) throws FileNotFoundException  {
		
		FileOutputStream obj=new FileOutputStream("C:\\Users\\Lenovo\\Documents\\mannual_project.txt");
		
		System.out.println(obj);
	}
}
