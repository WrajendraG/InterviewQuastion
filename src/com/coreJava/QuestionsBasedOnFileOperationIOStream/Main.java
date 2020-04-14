/**
 * Created by WrajendraG on 3/12/2017.
 */
package com.coreJava.QuestionsBasedOnFileOperationIOStream;

import com.coreJava.QuestionsBasedOnFileOperationIOStream.FileOperation;

public class Main
{
    public static void main(String [] args)
    {
        String filePath ="C:\\Users\\WrajendraG\\Desktop\\javaFile\\FileCreateUsingDifferentPakInJava.txt";
        FileOperation fileOperation = new FileOperation(filePath);

        System.out.print("Just Check Flag to File is Create or  not =  "+fileOperation.createFile());

        if(fileOperation.createFile())
        {
                    if(fileOperation.writeDataToFile("Hello EveryOne!!!  I am Trying to create file using different package"))
                    {
                        String returnedData = fileOperation.readFile();

                        System.out.println("\nReturned data : " + returnedData);
                    }
                    else
                    {
                        System.out.println("\nError while writing data to file");
                    }
        }
        else
        {
        System.out.println("\nError while file creation");
        }

    }
}
