package com.coreJava.QuestionsBasedOnArrayDifferentPatternsLogic; /**
 * Created by raju on 10/1/17.
 */
import java.util.*;
public class Pattern1
{
    public static void main(String args[])
    {
        int i,j,num;
        Scanner s = new Scanner(System.in);

        System.out.print("\n\t\tEnter Number = ");
        num =  Integer.parseInt(s.nextLine());
        for(i=1;i<=num;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(" "+j);
            }
         System.out.print("\n");
        }
       //---------------------------------  half above  and half down Reverse ---------------------
        for (i=num;i>=1;i--)
        {
            for (j=1;j<=i;j++)
            {
                System.out.print(" "+j);
            }
            System.out.print("\n");
        }

    }
}
/*
*
		Enter Number = 10
 1
 1 2
 1 2 3
 1 2 3 4
 1 2 3 4 5
 1 2 3 4 5 6
 1 2 3 4 5 6 7
 1 2 3 4 5 6 7 8
 1 2 3 4 5 6 7 8 9
 1 2 3 4 5 6 7 8 9 10
 1 2 3 4 5 6 7 8 9
 1 2 3 4 5 6 7 8
 1 2 3 4 5 6 7
 1 2 3 4 5 6
 1 2 3 4 5
 1 2 3 4
 1 2 3
 1 2
 1
*/