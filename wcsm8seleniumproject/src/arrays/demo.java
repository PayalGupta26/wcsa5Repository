package arrays;

import java.util.Scanner;

public class demo {
	public static void main(String[] args) {
		
	//	String [] s;//array declaration
		//s=new String [5];//array instansiation
		
		String [] s=new String [5];
		System.out.println(s);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 5 names");
		
		s[0]="payal";//array initialization
		s[1]="akash";
		s[2]="anirudh";
		s[3]="savita";
		s[4]="urja";
		
//		System.out.println(s[0]);
//		System.out.println(s[1]);
//		System.out.println(s[2]);
//		System.out.println(s[3]);
//		System.out.println(s[4]);
		
		for (int index = 0; index < s.length; index++) {
			
			System.out.println(s[index]);
			
		}



		
	}

}
