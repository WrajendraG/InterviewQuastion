package com.coreJava.QuestionsBasedOnNumberConversionLogic;
/*
 * Problem :
 * This code is design using two methods, create own logic and use predefined method.
 * Binary number system contain only two digits 0 and 1 and it have base 2.
  Decimal Number representation of a real number using the base ten and decimal notation.
Binary Number contains only 0 and 1.
 *
 *
 * */
import java.util.Scanner;
import java.util.Stack;

public class Convert_Decimal_to_Binary {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Stack<Integer> stack=new Stack<Integer>(); // whenever you got binary number then push to stack

		System.out.print("Enter Decimal Number = ");

		int num = scanner.nextInt();//7

		while(num != 0)
		{                       //  loop 1            // loop 2        // loop 3
			int temp = num%2;   // 7%2=0.14==  0      // 3%2=0.06==0   //1%2=0.02 =0
			stack.push(temp);
			num= num/2;         // 7/2=3.5 == 3        //3/2=1.5 =1     //1%2=0.5 =0

		}
		System.out.println("Binary Number is = ");
		while(!(stack.isEmpty()))
		{

			System.out.print(stack.pop()); //111

		}

		scanner.close();
		stack.clear();
	}//end main

}
