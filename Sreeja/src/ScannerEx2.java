import java.util.*;
public class ScannerEx2 {
    public static void main(String[] args)
     {
        Scanner sum = new Scanner(System.in);       //create scanner object and read the values from console

        
        System.out.println("Enter value and sample values");
        int value = sum.nextInt();          //read the value
        int sample = sum.nextInt();         //read the value

        int sumOfTwo = value+sample;    //adding of two input values 
        System.out.println(sumOfTwo);       //printing the result



        long data  = sum.nextLong();

        System.out.println(data);
        sum.close();

    }  
}
