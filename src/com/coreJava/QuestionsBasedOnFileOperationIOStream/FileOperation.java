/**
 * Created by WrajendraG on 3/12/2017.
 */
package com.coreJava.QuestionsBasedOnFileOperationIOStream;

import java.io.*;

public class FileOperation
{
    public String filePath ;

    public FileOperation(String filePath)
    {
        this.filePath = filePath;    // Constructor
    }

            public boolean createFile()
            {
                File newFile = new File(filePath);
                            try
                            {
                                newFile.createNewFile();
                            }
                            catch (IOException e)
                            {
                                e.printStackTrace();
                            }

                                            if(newFile.exists())
                                            {
                                                return true;
                                            }
                                            return false;
            }

    public boolean writeDataToFile(String data)
    {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try
        {
            fileWriter = new FileWriter(filePath);
            bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(data);

            return true;
        }
        catch (IOException e)
        {
            return false;
        }
        finally
        {

            try
            {
                bufferedWriter.close();
                fileWriter.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public String readFile()
    {
        try
        {
            String data = "";

            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

            String line;

            while((line = bufferedReader.readLine()) !=null)
            {
                data = data + line;

                // / System.out.println("line:"+line);

                return data;
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return null;
    }
}