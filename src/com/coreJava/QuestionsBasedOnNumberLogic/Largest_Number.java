package com.coreJava.QuestionsBasedOnNumberLogic;
/*
 * Input three number from user and compare these number with each others and find largest number
 *  among these three numbers.
 *  Here i am using ternary operator for find largest number.
 *
 *.length() is a method of a String class and which returns the number of characters in the string. 
 *.length will give the number of elements stored in an array. ... Array.length is a property of that Array ,
 * similar to a variable reference. ArrayList.size() is an actual method call to the array list object
 * */
public class Largest_Number {
	public static void main(String args[])
	{
		int numberArray[]={45,2,30,46,7,90,88};  // we can take array form user using for loop

		System.out.println("Before Short Array is = ");
		for(int i =0 ; i<=numberArray.length-1 ; i++)  // whenever you use <= then need length-1 other wise no need.
		{
			System.out.print(numberArray[i]);
			System.out.print(" ");
		}

		for(int i =0 ; i<=numberArray.length-1 ; i++)
		{
				for(int j = i+1 ; j<=numberArray.length-1 ; j++)
				{
					if(numberArray[i]>numberArray[j])
					{
					int temp=numberArray[i];
					numberArray[i]=numberArray[j];
					numberArray[j]=temp;
					}

				}

		}
		System.out.println();
		System.out.println("After short Array is =  ");
		for(int i =0 ; i<=numberArray.length-1 ; i++)
		{
			System.out.print(numberArray[i]);
			System.out.print(" ");
		}
		System.out.println();
		System.out.print("Largest Number is = "+numberArray[numberArray.length-1]);
		System.out.println();
		System.out.print("Smallest Number is = "+numberArray[0]);

	/*	for Three Value because only six combination of three value
		if(a>=b && a>=c)
		{
		System.out.println("Largest number: "+a);
		}
		if(b>=a && b>=c)
		{
		System.out.println("Largest number: "+b);
		}
		if(c>=a && c>=b)
		{
		System.out.println("Largest number: "+c);
		}

	*/


	}

}
/*
Before Short Array is =
45 2 30 46 7 90 88
After short Array is =
2 7 30 45 46 88 90
Largest Number is = 90
Smallest Number is = 2
 *
 * */
