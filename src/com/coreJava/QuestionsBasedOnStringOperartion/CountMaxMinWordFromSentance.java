package com.coreJava.QuestionsBasedOnStringOperartion;

public class CountMaxMinWordFromSentance 
{

	public static void main(String arg[])
	{
		
		String sentanceIs="India is my Country and I am RajendraWaghmare";
		String arrayOfSentanceIs[]=sentanceIs.trim().split(" ");
		int sizeOfArrayofScentanceIs=arrayOfSentanceIs.length;
		
		 int maxWordLenIs=0;
		 int maxIndexofArrayIs=0;
		 
		 int minWordLenIs=0;
		 int minIndexofArrayIs=0;
		 
		 int previousWordLenIs=0;
		
		for (int i = 0; i < sizeOfArrayofScentanceIs; i++) {
			
			String word = arrayOfSentanceIs[i];
		     int wordLength = word.length();
		
		     if(previousWordLenIs < wordLength)
		     {
		    	 maxWordLenIs=wordLength;
		    	 maxIndexofArrayIs=i;
		     }
		     
		     if(previousWordLenIs > wordLength)
		     {
		    	 minWordLenIs=wordLength;
		    	 minIndexofArrayIs=i;
		     }
		     previousWordLenIs=wordLength;
		}
		
		System.out.println("===============================MAX================================");
		System.out.println("Higest length of word in string is " +arrayOfSentanceIs[maxIndexofArrayIs]);
		System.out.println("length of that word is " +maxWordLenIs);
		System.out.println("================================MIN===============================");
		System.out.println("Smallest length of word in string is " +arrayOfSentanceIs[minIndexofArrayIs]);
		System.out.println("length of that word is " +minWordLenIs);
		System.out.println("===============================================================");
	}
}

/*===============================MAX================================
Higest length of word in string is RajendraWaghmare
length of that word is 16
================================MIN===============================
Smallest length of word in string is I
length of that word is 1
===============================================================*/
