package qsp;

public class p4 {
	
	
	public static void sum(char a,char b  )
	{   
		int sum=0;
		for(;a<=b;a++)
		{
			sum=sum+a;
		}
		 System.err.println(sum);
			
	}
	
	
	public static void test(int n)
	{
		String res=n>0?"even":"odd";
		System.out.println("the no is :"+res);
		
	}

	public static void main(String[] args) {
		
		sum('a','e');
		test(5);

	}

}
