package Strings;

import java.util.Scanner;

public class StringExercise2 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the Name:");   //prints the val 
        Scanner objs = new Scanner(System.in);    //scanner class
        String st = objs.nextLine();
        System.out.println("Enter the Next Name:");   //prints the name 2nd time
        String st1 =objs.nextLine();     
        System.out.println("The Values of the Names:"+st.compareTo(st1));    //comparing two strings
        objs.close();   //scanner close
    }
    
}
