package Strings;

import java.util.Scanner;

public class StringExercisereverse 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the string:");
        Scanner sc = new Scanner(System.in);   //scanner class object
        String st=sc.nextLine();
        StringBuffer sb = new StringBuffer("Batch");  //buffer class 
        sb.append(st);  //adds the string 
        sb.reverse();   //reverse the string 
        System.out.println(sb);   //prints the reverse string 
        sc.close();
    }    
}
