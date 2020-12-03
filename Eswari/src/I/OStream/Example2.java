package I.OStream;

import java.util.Scanner;

public class Example2 
{
    public static void main(String[] args) 
    {
        //scanner class
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        //string printing
        System.out.println("The name is " +name);
        double value = sc.nextDouble();                     //double value method
        //double value printing
        System.out.println("The double value is " +value);
        float value1 = sc.nextFloat();                          //float value method
        //float value printing
        System.out.println("The float value is " +value1);
        long value2 = sc.nextLong();                                //long value method
        //long value printing
        System.out.println("The long value is " +value2);
        
        sc.close();
    }
    
}
