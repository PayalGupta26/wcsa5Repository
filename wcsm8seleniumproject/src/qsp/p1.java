package qsp;//type casting-->primitive type casting

public class p1 {

	public static void main(String[] args) {
     
		//widning
		char ch='a';
		int n=ch;
		System.out.println(ch);
		System.out.println(n);
		
		//narrowing
		int n1=100;
		char ch1=(char)n1;
		System.out.println(n1);
		System.out.println(ch1);


	}

}
