package Strings;

import java.util.Scanner;

public class StringExerciseclear 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the Strings:");
        Scanner sc = new Scanner(System.in);    //scanner object
        StringBuffer sb = new StringBuffer();   //string buffer object
        String str= sc.nextLine();
        //String str1 = sc.nextLine();
        sb.append("Bindu");    //adds to next string 
        sb.append(str);
        System.out.println(sb);  //prints the combined string
        sb.delete(2,4);     //delete the string for certain place
        System.out.println("after deletion of string:"+sb);
        sb.setLength(6);    //set the string length 
        System.out.println(sb);   //prints the length of the string
        sb = new StringBuffer();    //creates the new string and del the entire string
        System.out.println("Deletion of string is:"+sb);
        sc.close();  //scanner close

        
    }
    
}
