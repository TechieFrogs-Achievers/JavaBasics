package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions9 
{
    public static void main(String[] args) throws Exception
    {  
        //try block for chances of occuring exception
        try
        {
           FileInputStream fis = new FileInputStream("D:\\Pgrm");//if the enterede file is not found then we get file not found

           int reader = fis.read();//read method to read the inputs from the file
           System.out.println("the file contains "+reader);
           fis.close();
        }
        catch(FileNotFoundException e)//catch block to handle the exception
        {
            System.out.println("the entered file is not found");
        }
    }
}
