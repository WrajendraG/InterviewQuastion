package com.coreJava.QuestionsBasedOnArray;

public class RemoveDuplicateElementFromArray {

	// Java Program to Remove Duplicate Elements
	// From the Array using extra space

	public static int[] removeDuplicates(int a[], int n) {
		// if(array size if 0 or 1 array is already sorted)
		if (n == 0 || n == 1) {
			return a;
		}

		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (a[i] != a[i + 1]) {
				a[j++] = a[i];
			}
		}

		a[j++] = a[n - 1];
		
		int[] uniq=new int[j];
		for(int i=0;i<j;i++){
			uniq[i]=a[i];
		}
		a=uniq;
		System.gc();
		return a;
	}

	public static int[] sortArray(int a[], int n) {
		// if(array size if 0 or 1 array is already sorted)
		if (n == 0 || n == 1) {
			return a;
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				int tmp = 0;
				if (a[i] > a[j]) {
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}

		return a;
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 5, 3, 8, 4, 5, 2, 5, 1, 6 };

		int n = a.length;

		int j = 0;

		// the function will modify the array a[]
		// such that the starting j elements
		// will be having all unique elements
		// and no element will be appearing more than
		// once
		System.out.print("\nShorted Array:"); 
		a=sortArray(a, n);
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
		
		a = removeDuplicates(a, n);
		System.out.print("\nUnique Array:");
		// printing array elements
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}

}
