package StringExamples;

import java.io.File;
import java.util.Scanner;
import java .io.FileNotFoundException;

public class WordsInFileP22 
{
    public static void main(String[] args)throws FileNotFoundException
    {
        int count = 0;
        Scanner sc = new Scanner(new File("D:\\Program22.txt"));
        while(sc.hasNext()) 
        {
          count++;  
        }
        System.out.println(count);
    }
    
}
