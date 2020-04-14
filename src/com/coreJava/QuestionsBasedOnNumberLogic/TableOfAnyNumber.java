package com.coreJava.QuestionsBasedOnNumberLogic;
/*
 * problem :
 *
 * I want Multiplication of number means table
 * first what you mean by table
 * example : 2
 * 2 * 1 = 2
 * 2 * 2 = 4
 * 2 * 3 = 6  meaning is thatNumberOfTable is Multiple by One to ten; // no* i;
 * 8
 * 10
 * 12
 * 17
 * 16
 * 18
 * 20
 *
 * */
import java.util.Scanner;

public class TableOfAnyNumber {

	public static void main(String[] args) {


		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter number Which table you want = ");
		int num = scanner.nextInt();

		for(int i=1 ; i <= 10 ; i++ )
		{
			int sum = num*i;
			System.out.println("| "+sum+" |");

		}//end for loop i
		scanner.close();

	}//end main


}//end class
/*
 *
 * Enter number Which table you want =

2
| 2 |
| 4 |
| 6 |
| 8 |
| 10 |
| 12 |
| 14 |
| 16 |
| 18 |
| 20 |
 * */
