package number;
/*Just remember a prime number can only be divided by 1 and itself, so it only has two divisors.
 *  The first 10 prime numbers are 2,3,5,7,11,13,17,19,23 and 29. 
 *  Notice that number 2 is the only even prime number in the list
 *  */
public class CountPrimeNumber1TO50 {

	public static void main(String[] args)
	{
		int count = 0;
		 boolean isPrime=true;
		for(int i=2; i<=100; i++)
		{
						for(int j=2;j<i-1;j++)
						{
							if(i%j==0)
							{
								isPrime=false;
								break;
							}
						}
				//System.out.println(i);
				if(isPrime)
				{
				System.out.print(i);
				System.out.println(" ");
				count++;
				}
			isPrime=true;
		}
		System.out.println("Total count of primne number is = "+ count);
	}
}
/*2 
3 
5 
7 
Total count of primne number is = 4
*/
