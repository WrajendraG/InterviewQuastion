package com.coreJava.QuestionsBasedOnFileOperationIOStream;

/**
 * Created by WrajendraG on 3/12/2017.
 */

import java.io.*;

public class FileStreamTest
{
    public static void main(String args[])
    {
        try
        {
                    byte bWrite [] = {11,21,3,40,50};
                   FileOutputStream os = new FileOutputStream("C:\\Users\\WrajendraG\\Desktop\\JavaFile2\\test.txt");

                    for(int x = 0; x < bWrite.length ; x++)
                    {
                      os.write((byte) bWrite[x] );   // writes the bytes
                    }
                    os.close();

                    FileInputStream is = new FileInputStream("C:\\Users\\WrajendraG\\Desktop\\JavaFile2\\test.txt");

                    int size = is.available();
                    for(int i = 0; i < size; i++)
                    {
                        System.out.print(((byte)is.read() + "  "));
                    }
                    is.close();
        }
        catch(IOException e)
        {
            System.out.print("Exception");
        }
    }
}
