package java_program2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class p6 {
	
	   public static void main(String[] args) {
		
		HashSet obj =new HashSet();
		obj.add(15);
		obj.add(55);
		obj.add(25);
		System.out.println(obj);
		
		ArrayList obj1 = new ArrayList(obj);
		
		Collections.sort(obj1);
		
	}
	

}
