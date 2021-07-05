package com.coreJava.QuestionsBasedOnNumberConversionLogic;

public class AddMulSubDiv {
	public void add(int x, int y) {
		int k = 0;
		while (y != 0) {
			k = x & y;
			x = x ^ y;
			y = k << 1;
		}
		System.out.println("Added Value: " + x);
	}

	public void subtract(int x, int y) {
		int k = 0;
		while (y != 0) {
			k = ~x & y;
			x = x ^ y;
			y = k << 1;
		}
		System.out.println("Subtracted Value: " + x);
	}

	public void multiply(int x, int y) {
		int k = 0;
		for (int i = 0; i < x; i++) {
			k = k + y;
		}
		System.out.println("Multiplied Value: " + k);
	}

	public void divide(int x, int y) {
		int k = 0;
		while (x >= y) {
			x = x - y;
			k++;
		}
		System.out.println("Divided Value: " + k);
	}

	public static void main(String[] args) {
		AddMulSubDiv amsd = new AddMulSubDiv();
		amsd.add(30, 20);
		amsd.subtract(30, 20);
		amsd.multiply(5, 4);
		amsd.divide(20, 5);
	}
}

/*
Added Value: 50
Subtracted Value: 10
Multiplied Value: 20
Divided Value: 4
*/