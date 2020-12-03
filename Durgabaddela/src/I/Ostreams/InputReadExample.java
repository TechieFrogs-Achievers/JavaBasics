package I.Ostreams;

import java.util.Scanner;

public class InputReadExample 
{
    public static void main(String[] args)
    {
        String str = "hey there im durga";   
          Scanner scan = new Scanner(str);//creating scanner object and passing the string   
          System.out.println("output: " + scan.hasNext()); //checking the scanner has string or not  
          System.out.println("String: " +scan.nextLine());//Print the string
          System.out.println("output2: "+scan.hasNextBigDecimal());//cheacks the decimal value is there or not
          scan.close();

    }
}
