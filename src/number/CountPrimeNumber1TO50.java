package number;

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
