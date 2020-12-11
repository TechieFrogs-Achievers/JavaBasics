package ExceptionDoc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Program5 
{
    public static void main(String[] args) throws IOException
    {
        try{
        FileInputStream fi = new FileInputStream("D\\: file.txt"); //class to access  file
        
        int a = fi.read();//read method 
        System.out.println(a);
        
        fi.close(); //close of obj
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }

    }    
}
