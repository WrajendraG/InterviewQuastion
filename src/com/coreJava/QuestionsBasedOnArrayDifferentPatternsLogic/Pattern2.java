package com.coreJava.QuestionsBasedOnArrayDifferentPatternsLogic; /**
 * Created by raju on 10/1/17.
 */

import java.util.*;
public class Pattern2
{
    public static void main(String args [])
    {
        int i,j,n;

        Scanner s = new Scanner(System.in);
        System.out.print("\n \t\tEnter Number = ");
        n = Integer.parseInt(s.nextLine());



        for (i=1; i<=n;i++)
        {
            for (j=1;j<=i;j++)
           {
               System.out.print(" * ");
           }
           System.out.print("\n");
        }


        for (i=n;i>=1;i--)
        {
            for (j=1;j<i;j++)
            {
                System.out.print(" * ");
            }
            System.out.print("\n");

        }

    }

}
/**


 Enter Number = 10
 *
 *  *
 *  *  *
 *  *  *  *
 *  *  *  *  *
 *  *  *  *  *  *
 *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *
 *  *  *  *  *  *
 *  *  *  *  *
 *  *  *  *
 *  *  *
 *  *
 *

 *
 */
