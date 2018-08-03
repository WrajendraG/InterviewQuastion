package string;

/*
 * problem :
 *
 * I want reverse string word but not sequence
 * like rajendra waghmare  is a string out put like ardnejar eramhgaw
 *
 * */
import java.util.Scanner;
public class ReverseStringWordButNotSequence {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		String reverse="";
		String temp="";


		System.out.println("Enter string = ");
		String orignalString=scanner.nextLine(); // raj wagh

		String StringArray[]=orignalString.split(" "); // raj wagh
												//index    0    1
		// now i want reverse each index and replace index

		for( int i=0 ; i <= StringArray.length-1 ; i++)
		{


			temp=StringArray[i];

			for(int j=temp.length()-1 ; j>=0  ; j--)
			{
				reverse=reverse+temp.charAt(j);

			}
			 // initilize again for next word
			StringArray[i]=reverse;
			reverse="";

		}
		System.out.print("Reverse Each Word but Not a Sequcenc :");
		for(int i = 0 ; i<=StringArray.length-1 ; i++)
		{

			System.out.print(StringArray[i]+" ");
		}
		scanner.close();
	}

}
/*
 * Enter string =
Thank you to Angad Lad For helping me !
Reverse Each Word but Not a Sequcenc :knahT uoy ot dagnA daL roF gnipleh em !
 * */
