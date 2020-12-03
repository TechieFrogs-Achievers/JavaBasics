package ScannerClass;

import java.io.File;
import java.util.Scanner;
import java .io.FileNotFoundException;

public class FileInput 
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("D:\\FileExample.txt"));//taking input file from d drive
        while(sc.hasNext())//if input has string or not
        {
            System.out.print("  " +sc.next());
        }

    }
}
