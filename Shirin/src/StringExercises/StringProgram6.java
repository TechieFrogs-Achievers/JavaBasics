package StringExercises;

import java.util.Scanner;

public class StringProgram6 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);// creating method
        System.out.println(" Enter the first name ");// entering name
         String str = sc.nextLine();
        System.out.println("Enter the seconf name ");
         String str1 = sc.nextLine();
         System.out.println(str.equals(str1));// true
        //System.out.println(str.equalsIgnoreCase(str1));//it ignore uppercase  & lowercase 
         sc.close();



        
        
    }
    
}
