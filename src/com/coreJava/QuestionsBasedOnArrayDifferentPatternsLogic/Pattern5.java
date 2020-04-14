package com.coreJava.QuestionsBasedOnArrayDifferentPatternsLogic;

import java.util.Scanner;

/**
 * Created by WrajendraG on 2/8/2017.
 */
public class Pattern5
{
    public static void main(String  args    []  )
    {
            int num=0,    i,  j,  count=1,temp=10;

        Scanner ip  =   new Scanner(System.in);

            System.out.println("\n\t\t\t\tEnter Number =  ");
            num = Integer.parseInt(ip.nextLine());
        for (i=1;   i<=num;   i++)
        {
            for (j=1;   j<=i;   j++)
            {

                System.out.print("\t"+count);
                count++;
            }
                System.out.print("\n");
        }
        //--------------------------------------------------------
        for (i=num; i>=1;i--)
        {
            for (j=1;j<=i;j++)
            {
                System.out.print("\t"+temp);
                temp--;
            }
            System.out.println();
        }
    }

}
/*
*
						Enter Number =
4
	1
	2	3
	4	5	6
	7	8	9	10
	10	9	8	7
	6	5	4
	3	2
	1
* */