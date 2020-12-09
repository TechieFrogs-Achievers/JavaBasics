package StringExercises;

import java.util.Scanner;

public class StringProgram16 
{
    public static void main(String[] args) 
    {
        System.out.println(" Enter the String ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(" After converting upperccase  :" + str.toUpperCase());
        //System.out.println("After converting  lowecase : " + str.toLowerCase());
        sc.close();
        
    }
    
}
