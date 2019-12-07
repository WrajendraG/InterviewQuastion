package array;


/*
 * i want to 1 to 50 all even and odd in particular array
 * you know even means num%2==0 otherwise Odd
 * i need two array to store even and odd
 *
 * */
public class StoreEvenOddWithinArray {


        public static void main(String[] args) {

                int num=50;


                int evenIndex=0,oddIndex=0;  //at the time store value in array index must be important;

                int even[] = new int[num/2];   // whenever initilize array we should assinge memory for that using new keyword;
                int odd[]=new int[num/2];

                                                for(int i=1; i<=50 ; i++ )
                                                {
                                                //i!=1 } 1/2 = 0.25 =0 because of int So its possible to 1 store in even array and thats not correct.
                                                                if(i%2 == 0 && i !=1)  // != 1 means 1 is not a prime because prime always contain 2 factroial 1 and it self;
                                                                {
                                                                        //System.out.print("from Even"+i);
                                                                        even[evenIndex]=i;
                                                                        evenIndex++;


                                                                }else{
                                                                        //System.out.print("from Odd"+i);
                                                                        odd[oddIndex]=i;
                                                                        oddIndex++;
                                                                }

                                                        }

                        System.out.println("Even Array is ");

                                for(int i=0;i<num/2;i++)
                                {
                                        System.out.print(even[i]);
                                        System.out.print(" ");
                                }


                        System.out.println();
                                System.out.println("odd Array is ");

                                for(int i=0; i<num/2;i++)
                                {
                                        System.out.print(odd[i]);
                                        System.out.print(" ");
                                }

        }


}

/*
 * Even Array is
2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50
odd Array is
1 3 5 7 9 11 13 15 17 19 21 23 25 27 29 31 33 35 37 39 41 43 45 47 49
 * */