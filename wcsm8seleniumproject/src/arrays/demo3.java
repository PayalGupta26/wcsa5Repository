package arrays;

import java.util.Scanner;

public class demo3 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);//take input from users
		System.out.println("enter the number");
		
		//take (size) input from the users only and store it in the size variable
		//int size=sc.nextInt();//with the help of refrance_var of scanner class we call next int method
		                       //to take int type of input
		int numbers[]= new int [6];
		
		for (int index = 0; index < numbers.length; index++) {
			
			System.out.println(numbers[index]);
			
		}
		
		
	}

}
