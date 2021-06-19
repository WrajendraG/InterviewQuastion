package com.coreJava.QuestionsBasedOnStringOperartion;

public class StringWordCount {

	public static void main(String[] args) 
	{
		int charCount=0;
		int SpaceCount=0;
		int CharICount=0;
		
		String str="    My country name is india";

		String splitedStr[]=str.trim().split(" ");
		
		int sizeofString = splitedStr.length;
		
		for (int i = 0; i < splitedStr.length; i++) {
			
			String temp=splitedStr[i];
			char [] charArray=temp.toCharArray();
			for (int j = 0; j < charArray.length; j++) {
				
				 char checkCharRetion=charArray[j];
				 
				     charCount=charCount+1;
					
					if (checkCharRetion == 'i') {
						
						CharICount=CharICount+1;
					}
				
			}
		}
		
		System.out.println("size of Sentance is " + sizeofString);
		System.out.println("size of word is " + charCount);
		System.out.println("size of Space within Sentace is " + SpaceCount);
		System.out.println("I of char within Sentace is " + CharICount);
		
	}
}
