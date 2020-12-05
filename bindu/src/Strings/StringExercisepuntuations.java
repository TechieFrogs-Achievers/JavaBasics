package Strings;

import java.util.Scanner;

public class StringExercisepuntuations 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   //scanner class object
        String s = sc.nextLine();
        int count =0;
        for(int i =0;i<s.length();i++)   //checks the length of string
        {
            if(s.charAt(i)=='?'||s.charAt(i)==','||s.charAt(i)==';'||s.charAt(i)=='@');   //checks the characters are present
            {
                count++;
            }
        }   
        System.out.println("Number of Puntuations:"+count);   //prins the count
        sc.close();     //scanner close
             
    }
    
}
