package number;
/*
 * Problem:
 * Armstrong number is a number that is the sum of its own digits each raised to the power of the number of digits is equal to the number itself. In java programming you can easily write Armstrong Program in Java just follow same concept of C programming, only need to use syntax of java programming language.

For example:
Three Digits Armstrong number is 153, 1 ^ 3 + 5 ^ 3 + 3 ^ 3 = 153
Four Digits Armstrong number is 1634, 1 ^ 4 + 6 ^ 4 + 3 ^ 4 + 4 ^ 4 + = 1634
firstly i want store my original user input number for comparison

*/
import java.util.Scanner;
public class Armstrong_Number {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int keep_Orignal_Number_for_check,Sum=0;


		System.out.print("Enter you are number to be check armstrong or not = ");
		int num = scanner.nextInt(); // whenever you are doing operation num value update
		keep_Orignal_Number_for_check=num;  // thats why i store num value different variable for comparison
		while(num>0)
		{
			//153 I want cube of 1^3+5^3+3^3

			int a = num%10;

			Sum=Sum+(a*a*a);  // here get cube of one digit and store global variable
			// now i want minimize that number for next loop or finding next cube

			num=num/10;

		}
		if(keep_Orignal_Number_for_check == Sum)
		{
			System.out.println("Entered Number is ArmStrong ");
		}else
		{
			System.out.println("Entered Number is not ArmStrong ");
		}

     scanner.close();

	}

}
/*
 *
 * Enter you are number to be check armstrong or not = 153
Entered Number is ArmStrong


Enter you are number to be check armstrong or not = 245
Entered Number is not ArmStrong

*/
