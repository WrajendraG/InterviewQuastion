package com.coreJava.QuestionsBasedOnNumberLogic;
import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);

    System.out.print("Enter two Number ");

	int a = scanner.nextInt();//10

	int b= scanner.nextInt();///20

	System.out.println("Befor Swaping a = "+a +" b = "+b);

	a= a+b;
// 30=10+20

	b= a-b;
// 10=30-20

	a=a-b;
// 20=30-10;

	System.out.println("After Swaping a = "+a +" b = "+b);

	scanner.close();

	}
}
/*
 *
 * Enter two Number 50
60
Befor Swaping a = 50 b = 60
After Swaping a = 60 b = 50

 * */
