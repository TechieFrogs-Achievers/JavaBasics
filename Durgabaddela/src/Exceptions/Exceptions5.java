package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions5 
{
    public static void main(String[] args) throws IOException
    {
        //try block
        try{
        FileInputStream fi = new FileInputStream("D:\\pgm.txt");//input file stream
        
        int n = fi.read();//read method to read the data into the file 
        System.out.println(n);
        
        fi.close();
        }
        catch(FileNotFoundException e)//catch block to handle the exception
        {
            System.out.println(e);
        }

    }
}
