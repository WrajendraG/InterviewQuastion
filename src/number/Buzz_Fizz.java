package number;
/*
 * Problem:
 * Write a program in C which prints the numbers from 1 to 100.
 *  But, multiples of 3 should be replaced with "Fizz", multiples of 5 should be replaced with "Buzz"
 *   and multiples of both 3 and 5 should be replaced with "FizzBuzz"?
 *
 * */
public class Buzz_Fizz {

	public static void main(String[] args) {

		for(int i =1 ; i<=100 ; i++)
		{
			if(i%3==0)
			{
		 	System.out.println(i+" Multiply by 3");

			}
		   if(i%5 == 0)
		   {


			System.out.println(i+" Multiply By 5");


		   }
			if(i%3==0 && i%5 == 0)
			{

			System.out.println(i+ " Multiply By 3&5");
			}

		}

	}

}
/*
 * 3 Multiply by 3
5 Multiply By 5
6 Multiply by 3
9 Multiply by 3
10 Multiply By 5
12 Multiply by 3
15 Multiply by 3
15 Multiply By 5
15 Multiply By 3&5
18 Multiply by 3
20 Multiply By 5
21 Multiply by 3
24 Multiply by 3
25 Multiply By 5
27 Multiply by 3
30 Multiply by 3
30 Multiply By 5
30 Multiply By 3&5
33 Multiply by 3
35 Multiply By 5
36 Multiply by 3
39 Multiply by 3
40 Multiply By 5
42 Multiply by 3
45 Multiply by 3
45 Multiply By 5
45 Multiply By 3&5
48 Multiply by 3
50 Multiply By 5
51 Multiply by 3
54 Multiply by 3
55 Multiply By 5
57 Multiply by 3
60 Multiply by 3
60 Multiply By 5
60 Multiply By 3&5
63 Multiply by 3
65 Multiply By 5
66 Multiply by 3
69 Multiply by 3
70 Multiply By 5
72 Multiply by 3
75 Multiply by 3
75 Multiply By 5
75 Multiply By 3&5
78 Multiply by 3
80 Multiply By 5
81 Multiply by 3
84 Multiply by 3
85 Multiply By 5
87 Multiply by 3
90 Multiply by 3
90 Multiply By 5
90 Multiply By 3&5
93 Multiply by 3
95 Multiply By 5
96 Multiply by 3
99 Multiply by 3
100 Multiply By 5
*/
