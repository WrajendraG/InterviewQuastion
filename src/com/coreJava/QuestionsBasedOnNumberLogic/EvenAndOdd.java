package com.coreJava.QuestionsBasedOnNumberLogic;

import java.util.Scanner;

public class EvenAndOdd {

	public static void main(String[] args) {

		logic();

	}
public static void logic()
{
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter your Number");

	int a = scanner.nextInt();
	if(a%2 == 0)
	{
		System.out.println("Number is even ");

	}else
	{
		System.out.println("Number is Odd");
	}
	scanner.close();
}

}
/*
 * Enter your Number
5
Number is Odd

Enter your Number
8
Number is even


*/
