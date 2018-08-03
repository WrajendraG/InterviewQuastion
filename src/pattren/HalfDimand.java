package pattren;
/*

			*
		   * *
		  *	* *
		 * * * *
		* * * * *
 * */



public class HalfDimand {

	public static void main(String[] args) {

		int i,j,space,num=5;

System.out.println("Print half of the dimand ");
		for(i=1 ; i<=num ; i++)
		{
			for(space=num-1; space>=i; space--)
			{
				System.out.print(" ");

			}
			for(j=1;j<=(2*i-1);j++)
			{

				System.out.print("*");
			}

			System.out.println();


		}
	}

}
