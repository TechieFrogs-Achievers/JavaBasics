package Strings;

import java.util.Scanner;

public class SubSetString 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); 
        int len = str.length();  
        int temp = 0;  
        String arr[] = new String[len*(len+1)/2];  //Total possible subsets for string of size n is n*(n+1)/2  

        for(int i = 0; i < len; i++)  //This loop maintains the starting character 
         {   
            for(int j = i; j < len; j++) //This loop adds the next character
            {  
                arr[temp] = str.substring(i, j+1);  
                temp++;  
            }  
        }   
        System.out.println("All subsets for given string are: ");  
        for(int i = 0; i < arr.length; i++) 
        {  
            System.out.println(arr[i]);  //prints the substrings
        }  
        sc.close();
        
    }
    
}
