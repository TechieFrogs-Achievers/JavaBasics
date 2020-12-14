package TypeCasting;

import java.util.Scanner;

public class NarrowingExample1 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);//scanner method
        System.out.println("enter an integer value:");
        int i=sc.nextInt();//int values take from console
        char ch=(char)i;//int to char
        System.out.println("char value in given integer: "+ch);//print charecter
    }
}
