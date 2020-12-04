package I.Ostreams;

import java.util.Scanner;

public class InputReadExample2
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       char ch = sc.next().charAt(0); //to read character
        // Print the read value 
        System.out.println("character = "+ch); 

        String s = sc.next();//to read string
        System.out.println("string ="+s);

        float f = sc.nextFloat();//to read float value
        System.out.println("float ="+f);

        //int i = sc.nextLine();
        
        int i = sc.nextInt();//to read integer
        System.out.println("inter value"+i);

        double d = sc.nextDouble();//to read double value
        System.out.println("double value"+d);

        boolean b = sc.nextBoolean();//to read the boolean value
        System.out.println("boolean ="+b);

         boolean bl = sc.hasNext();
         System.out.println(bl);

        
        sc.close();

 
    }
}
