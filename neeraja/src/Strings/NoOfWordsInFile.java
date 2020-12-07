package Strings;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class NoOfWordsInFile {
    public static void main(String[] k) throws FileNotFoundException {
        //input from a file
        Scanner scan=new Scanner(new File("E:\\data.txt"));
        int count=0;
       
        while(scan.hasNext()){
            count++;
         }
       System.out.println("count is "+count);
    }
    
}
