package qsp;

public class p5 {

	 
	public static void prod(int a,int b)
	{ int product=1;
		while(a<=b)
		{
			product=product*a;
			a++;
		}
		System.out.println(product);
	}
	
	public static void sum(int a,int b)
	{ int sum=0;
		while(a<=b)
		{
			sum=sum+a;
			a++;
		}
		System.out.println(sum);
	}


	public static void main(String[] args) {

		prod(1,5);
		sum(1,10);
	}

}
