
package com.coreJava.QuestionsBasedOnStringOperartion;
import java.util.Scanner;
public class ReversString {

	public static void main(String[] args) {

		String reverse=""; // store  reverse string globelly

		Scanner s = new Scanner(System.in);

		System.out.print("Enter String ");
		String str = s.nextLine();

		// logic before write program or implemantation
		// r a j e n d r a
		// 0 1 2 3 4 5 6 7
//i want   7 6 5 4 3 2 1 0

		System.out.println("Length of string "+str.length());
        System.out.println("before reverse string is = "+str);

		// here length return 8 because length start from 1 ;
		for (int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);  // concat string using + and charAt retern specefic charater

		}
		System.out.println("reverse String is = "+reverse);

		s.close();
	}
}
/*
 *
Enter String rajendra waghmare
Length of string 17
before reverse string is = rajendra waghmare
reverse String is = eramhgaw ardnejar
 */