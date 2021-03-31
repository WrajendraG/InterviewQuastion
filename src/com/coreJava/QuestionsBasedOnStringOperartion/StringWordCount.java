package com.coreJava.QuestionsBasedOnStringOperartion;

public class StringWordCount {

	public static void main(String[] args) 
	{
		
		String str="    My country name is india";

		String splitedStr[]=str.trim().split(" ");
		
		int sizeofString = splitedStr.length;
		
		
		System.out.println("size of word is " + sizeofString);
	}
}
