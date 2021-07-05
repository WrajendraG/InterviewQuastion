package com.coreJava.QuestionsBasedOnNumberConversionLogic;

public class Swapping {

		public static void main(String args[]){
			int x = 20;
			int y = 30;
			
			//Swapping 2 numbers without using temp variable
			
			x = x + y;
		//  50=20 +30
			y = x - y;
		//  20= 50-30	
			x = x - y;
		//  30= 50-20
			System.out.println("Value of x: "+x);
			System.out.println("Value of y: "+y);
		
	}
	
}

/*Value of x: 30
Value of y: 20
*/