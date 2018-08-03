package number;
/*
 * Problem:
 * I want to reverse number 123 == 321
 * So what can we do?
 * => first using String is simple mean Store as a string and reverse for loop print;
 * 	but problem is this is take as a int and also find reverse
 *  		So here we cant use charAt method
 *  			so  first take remimder of this number 123%10 = 12.3 means he return always last value
 *  so now Store this value globae using multiple by 10 because of % 10 now you must divide this number by 10.
*    123/10 = 12.3
 *
 * */
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		int reminder,reverse=0;

        Scanner scanner = new Scanner(System.in);
		System.out.println("Which Number do you want reverse Enter that Number = ");
		int num = scanner.nextInt();

		while(num>0)
		{
			/*loop 1
			 * example user input 123
			 * check while condation it's gather then 0
			 *  number mod 123%10 is 3
			 *  reverse is zero initilizlly 10*0 = 0 and 0 + 3 = 3 so reverse store 3;
			 *  123/10 = 12.3 because of datatype int that store only 12 so number is reduced */

			/*loop 2
			 * example user input 12
			 * check while condation it's gather then 0
			 *  number mod 12%10 is 2
			 *  reverse is 3 initilizlly 10*3 = 30 and 30 + 2 = 32 so reverse store 32;
			 *  12/10 = 1.2 because of datatype int that store only 1 so number is reduced */


			/*loop 3
			 * example user input 1
			 * check while condation it's gather then 0
			 *  number mod 1%10 is 1
			 *  reverse is 32 initilizlly 10*32 = 320 and 320 + 1 = 321 so reverse store 321;
			 *  0/10 = 0 next time files while condition */

			reminder = num%10;
			reverse = (reverse*10) + reminder;
			num = num/10;

		}

		System.out.println("Reversed Number is "+reverse);

scanner.close();
	}


}
/*
 *
 * Which Number do you want reverse Enter that Number =
123
Reversed Number is 321

 * Which Number do you want reverse Enter that Number =
54628
Reversed Number is 82645
*/
