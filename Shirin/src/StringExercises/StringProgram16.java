package StringExercises;

import java.util.Scanner;

public class StringProgram16 
{
    public static void main(String[] args) 
    {
        System.out.println(" Enter the String ");
        Scanner sc = new Scanner(System.in);// scanner class
        String str = sc.nextLine();// string variable
        System.out.println(" After converting upperccase  :" + str.toUpperCase());
        //System.out.println("After converting  lowecase : " + str.toLowerCase());
        sc.close();// closing scanner class
        
    }
    
}
