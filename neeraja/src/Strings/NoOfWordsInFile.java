package Strings;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class NoOfWordsInFile {
    public static void main(String[] k) throws FileNotFoundException {
        //input from a file
        Scanner scan=new Scanner(new File("E:\\data.txt"));
        int count=0;
       
        while(scan.hasNextInt()){
            count++;
            // System.out.println(scan.hasNextInt());
             //sum=sum+scan.nextInt();
        }
       System.out.println(count);
    }
    
}
