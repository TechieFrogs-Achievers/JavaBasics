package scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Examin1 {
    
    //main method which throws filenotfound exception
    public static void main(String[] jn) throws FileNotFoundException {

        //USING SCANEER(FILE SOURCE)
        //scanner class which was reading input from a file
        Scanner scan=new Scanner(new File("E:\\data.txt"));
        long sum=0;
        //loop checking for next token of type long using hasnextlong method
       /* while(scan.hasNextInt()){
             System.out.println(scan.nextInt());
             sum=sum+scan.nextInt();
        }  
        System.out.println("total sum is :"+sum); */
        while(scan.hasNextInt()){
            System.out.println(scan.nextInt());
           // sum=sum+scan.nextInt();
       }
        //printing sum of values in a file
        

    }
}
