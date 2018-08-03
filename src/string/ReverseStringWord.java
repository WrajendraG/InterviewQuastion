package string;

import java.util.Scanner;

/*    // make paper logic first what do you then write a program
 * I  want whennever i enter string like rajendra waghmare
 * print this like waghmare rajendra;
 *
 * */
public class ReverseStringWord {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter sentance = "); // rajendra waghmare
		String str = scanner.nextLine();

		// i want split this string into array using split method
		// whenever space is fine split from that space

		String str_arry[]=str.split(" "); // perticular sentance store in array from 0 to nth

		// rajendra waghmare
		//   0			1

		int size_array=str_arry.length;  // length start from 1

		System.out.println("After reverse word String is :");
		// length is 2
					// 2-1=1        0==0
		for(int i = size_array-1 ; i>=0; i-- )
		{

			System.out.print(str_arry[i]);
			System.out.print(" "); // space for each of new word
		}

		scanner.close();
	}
}
/*
 *
 *Enter sentance =
Rajendra waghmare
After reverse word String is :
waghmare Rajendra
 *
 *
 *
 *
 * Enter sentance =
I am java Developer !
After reverse word String is :
! Developer java am I
 * */
