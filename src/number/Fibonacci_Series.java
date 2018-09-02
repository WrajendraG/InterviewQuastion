package number;
/*Problem:
 * Fibonacci series is in the form of 0, 1, 1, 2, 3, 5, 8, 13, 21,......
 * To find this series we add two previous terms/digits and get next term/number.
 * So I want two variable to store previous value current value and next value and sum
 * */
public class Fibonacci_Series {

	public static void main(String[] args) {

		int num=10; // I am doing hard coding, you can take number form user

		int firstNumber=0,lastNumber=1,CurrentNumber;

		System.out.println("Fibonacci series of 10 ");

		System.out.println(firstNumber);
		System.out.println(lastNumber);

		for(int i=2 ; i<= num ; i++)
		{
			CurrentNumber = firstNumber+lastNumber; // i dont need frist number so
		//	    1              0       +    1

			firstNumber = lastNumber; // because I need last number to store
		//       1             1

			 // but in next loop currentNumber value will update so that 1 value must be store in

		 lastNumber = CurrentNumber;
		 //   1              1

		 // so now we have
		 // firstNumber = 1
		 // lastNumber = 1
		 // next loop currentNumber will be = 2
		 // so on.....
		 System.out.println(CurrentNumber);
		}

	}

}
/*
 *
 Fibonacci series of 10
0
1
1
2
3
5
8
13
21
34
55

*/
