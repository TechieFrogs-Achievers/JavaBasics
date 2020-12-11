package ExceptionHandling;//package for ExceptionHandling
import java.io.*; //package for java.io
public class CheckedException { //class for Chacke Exception
    public static void main(String[] args) 
    {
        FileInputStream fis=null; // file is empty
        try{
            fis=new FileInputStream("B:/myfile.txt"); //try block that file is not there
        }
        catch(FileNotFoundException fe) //handling the exception for try block FileNotFoundException
        {
            System.out.println("The specified file is not "+"present at the given path");
        }
        int k; //datamember
        try //try block for reading the file
        {
            while((k=fis.read())!=-1) //while loop the file is reading 
            {
               System.out.println((char)k); //file printing or reading
            }
            fis.close(); //file closing
        }
        catch(IOException io) //catch block for checked Exception IO
        {
           System.out.println("I/O error occured:"+io); //printing the type of exception
        }
    }
}
