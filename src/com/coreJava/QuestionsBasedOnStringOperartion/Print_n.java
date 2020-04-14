package com.coreJava.QuestionsBasedOnStringOperartion;

public class Print_n {

	public static void main(String[] args) throws Exception{
		
		
		System.out.println(fac(5));
		//System.out.println(Class.forName("String").getName());

	}
	
	public static long fac(int n)
	{
		if(n == 1)
		{
			return 1;
		}
		return n * fac(n-1);
		
	}
/*	
	public int foo(int x, int y)
	{
		
		Integer z;
		if(z!=null)
		{
			z=x=y;
		}
		return z;
	}
*/
	
	
}