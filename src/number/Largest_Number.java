package number;
/*
 * Input three number from user and compare these number with each others and find largest number
 *  among these three numbers.
 *  Here i am using ternary operator for find largest number.
 *
 * */
public class Largest_Number {
	public static void main(String args[])
	{
		int numberArray[]={45,2,30,46,7,90,88};  // we can take array form user using for loop

		int size= numberArray.length;
		System.out.println("Before Short Array is = ");
		for(int i =0 ; i<=size-1 ; i++)
		{
			System.out.print(numberArray[i]);
			System.out.print(" ");
		}

		for(int i =0 ; i<=size-1 ; i++)
		{
				for(int j = i+1 ; j<=size-1 ; j++)
				{
					if(numberArray[i]>numberArray[j])
					{
					int temp=numberArray[i];
					numberArray[i]=numberArray[j];
					numberArray[j]=temp;
					}

				}

		}
		System.out.println();
		System.out.println("After short Array is =  ");
		for(int i =0 ; i<=size-1 ; i++)
		{
			System.out.print(numberArray[i]);
			System.out.print(" ");
		}
		System.out.println();
		System.out.print("Largest Number is = "+numberArray[size-1]);
		System.out.println();
		System.out.print("Smallest Number is = "+numberArray[0]);

	/*	for Three Value because only six combination of three value
		if(a>=b && a>=c)
		{
		System.out.println("Largest number: "+a);
		}
		if(b>=a && b>=c)
		{
		System.out.println("Largest number: "+b);
		}
		if(c>=a && c>=b)
		{
		System.out.println("Largest number: "+c);
		}

	*/


	}

}
/*
Before Short Array is =
45 2 30 46 7 90 88
After short Array is =
2 7 30 45 46 88 90
Largest Number is = 90
Smallest Number is = 2
 *
 * */
