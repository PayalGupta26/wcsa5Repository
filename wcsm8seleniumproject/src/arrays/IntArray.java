package arrays;

import java.util.Iterator;
import java.util.Scanner;

public class IntArray {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int [] x= new int [5]; //declaration and instantiation
		
		System.out.println("enter the int number");
		
//		x[0]=25;
//		x[1]=35;
//		x[2]=45;
//		x[3]=55;
//		x[4]=65;
//		System.out.println(x);

		
		for (int index = 0; index <= x.length-1; index++) {
			
			x[index]=sc.nextInt();
			
		//	System.out.println(x[index]);
			
		}
		
       for (int index = 0; index <= x.length-1; index++) {
			
			//x[index]=sc.nextInt();
			
		
	         System.out.println(x[index]);
		}
	}

}
