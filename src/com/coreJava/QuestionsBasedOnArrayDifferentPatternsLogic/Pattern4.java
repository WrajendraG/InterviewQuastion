package com.coreJava.QuestionsBasedOnArrayDifferentPatternsLogic;

import java.util.Scanner;

/**
 * Created by raju on 10/1/17.
 */

public class Pattern4
{
    public static void main(String args[]) {
        int i, j, n;

        Scanner s = new Scanner(System.in);
        System.out.print("\n \t\tEnter Number = ");
        n = Integer.parseInt(s.nextLine());
        for (i =1; i <= n; i++)
        {
            for (j =1; j <= i; j++)
            {

                System.out.print(" * " +j);

            }
            System.out.println();
        }
        for (i =1; i <= n; i++)
        {
            for (j = n; j >= i; j--)
            {

                System.out.print(j+" * ");
            }
            System.out.println();
        }

    }
}

/*

 		Enter Number = 10
 * 1
 * 1 * 2
 * 1 * 2 * 3
 * 1 * 2 * 3 * 4
 * 1 * 2 * 3 * 4 * 5
 * 1 * 2 * 3 * 4 * 5 * 6
 * 1 * 2 * 3 * 4 * 5 * 6 * 7
 * 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8
 * 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9
 * 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10
10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1 *
10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 *
10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 *
10 * 9 * 8 * 7 * 6 * 5 * 4 *
10 * 9 * 8 * 7 * 6 * 5 *
10 * 9 * 8 * 7 * 6 *
10 * 9 * 8 * 7 *
10 * 9 * 8 *
10 * 9 *
10 *

* */