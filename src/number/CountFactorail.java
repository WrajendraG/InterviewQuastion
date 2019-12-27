package number;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * I want calculate sum of 4! = 1*2*3*4=24;
 * Firstly take input from user
 * rotate for loop upto that number
 * store multiplication on global variable and multiply to next rotation
 *
 * */

class BusinessLogic
{

	int fact=1;
    int num;

	Scanner s= new Scanner(System.in);

	public void countFact()
	{
			try{
				System.out.println("Enter number = ");
				 num=s.nextInt();

					// 4!
					// 1*2*3*4
				 for(int i=1 ; i <= num; i++ )
					{
						fact=fact*i;
						System.out.println(i+" Fact ="+fact);

					}
				 System.out.println("factorial  sum is =  "+fact);

			}catch(InputMismatchException e)
			{
				System.out.print("Enter only Number not a string");
				//countFact(); // goto method its going to infinite loop
			}catch(Exception e)
			{
				e.printStackTrace();
			}
	}

static{

		System.out.println(" Count factorial of number ");
	  }

}
public class CountFactorail {

	public static void main(String args[])
	{
		BusinessLogic obj = new BusinessLogic();
		obj.countFact();

	}// end main
}// end class

/*
 *  Count factorial  of number
Enter number =
4
factorial sum is =  24


 Count factorial of number
Enter number =
5
factorial  sum is =  120


 Count factorial of number
Enter number =
A
Enter only Number not a string

 Count factorial of number
Enter number =
5
1 Fact =1
2 Fact =2
3 Fact =6
4 Fact =24
5 Fact =120
factorial  sum is =  120

 * */