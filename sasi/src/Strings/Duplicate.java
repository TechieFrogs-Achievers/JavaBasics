package Strings;

import java.util.Scanner;

public class Duplicate 
{
    public static void main(String[] args)
     {
        System.out.println("Enter the string :");
        Scanner sc = new Scanner(System.in);//scanner class
        String str = sc.nextLine();// object
        int count;
        char Array[] = str.toCharArray();//Array for storing the characters
        for( int i =0; i< str.length(); i++)// checks the first character
        {
            count=1;
            for( int j = i+1; j< str.length(); j++)// checks the next character 
            {
                if(Array[i]==Array[j] && Array[i]!=' ')// if two character are equal count increase
                {
                    count++;
                    Array[j]='0';//if two characters are not equal
                }

                }
                if(count>1 && Array[i]!='0')// if count increase greater than one duplicate array display  
                {
                    System.out.println(Array[i]+" "+count);// print number of duplicate characters
                }
                sc.close();
            }
        }
    }

