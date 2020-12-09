package Strings;

import java.util.Scanner;

public class StringRotation14 
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);     //scanner class object
        System.out.println("Enter the first string ");
        String str1 = sc.nextLine();         // string creation 
        System.out.println(" enter the second string");
        String str2 = sc.nextLine();
        if(str1.length()!= str2.length())    // loop that checks whether it is equal or not
        {
             str1 = str1.concat(str1);    //adds the string
        }  
        if(str1.indexOf(str2)!=-1)        // loop for checking str2 is in str1 are not
        {
            System.out.println("string2 rotation to string 1" +str2);   //prints the string2
        }
        else
        {
            System.out.println(" string2 is not rotate to string1 ");
            sc.close();    //scanner close
        }
        
    }
    
}
