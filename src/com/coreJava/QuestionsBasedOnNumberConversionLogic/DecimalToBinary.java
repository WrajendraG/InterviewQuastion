package com.coreJava.QuestionsBasedOnNumberConversionLogic;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.");
		StringBuffer str= new StringBuffer();
		int num=sc.nextInt();
		while(num!=0)
		{
			int temp=num%2;
			str.append(temp);
			num=num/2;
		}
		System.out.println("Binary no. is..\t"+str.reverse());

		sc.close();

	}

}
