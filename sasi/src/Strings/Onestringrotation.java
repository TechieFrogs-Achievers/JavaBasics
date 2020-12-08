package Strings;

import java.util.Scanner;

public class Onestringrotation 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);//scanner class
        System.out.println("Enter the first string ");
        String str1 = sc.nextLine();// string variable
        System.out.println(" enter the second string");
        String str2 = sc.nextLine();
        if(str1.length()!= str2.length())// loop for checks the two strings equal are not
        {
             str1 = str1.concat(str1);
        }
        if(str1.indexOf(str2)!=-1)// loop for checking str1 is in str2 are not
        {
            System.out.println("string2 rotation to string 1" +str2);
        }
        else 
        {
            System.out.println(" string2 is not rotate to string1 ");
            sc.close();
    }
}
}
