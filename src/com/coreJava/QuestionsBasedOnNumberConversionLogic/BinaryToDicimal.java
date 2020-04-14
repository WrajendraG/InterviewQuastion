package com.coreJava.QuestionsBasedOnNumberConversionLogic;

import java.util.Scanner;

public class BinaryToDicimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.");
		String binary=sc.next();

		//System.out.println(Integer.parseInt(binary,2)); //using in build function

		String temp="";
		int num=1,decimal=0;
		for(int i=binary.length()-1;i>=0;i--)
		{
			temp=temp+binary.charAt(i);
			int t=Integer.parseInt(temp);
			if(t==0 || t==1)
			{
				if(t==1)
				{
				decimal=decimal+num;
				}
				num=num*2;
			}
			else
			{
				System.out.println("Please enter valid binary number.");
				break;
			}
			temp="";
		}
		System.out.println("Decimal no. is\t"+decimal);

	sc.close();
	}
}
