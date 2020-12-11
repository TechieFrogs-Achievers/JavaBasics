package Strings;

import java.util.Scanner;

public class StringCharacterFrequency 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the string:");
        Scanner sc = new Scanner(System.in);  //scanner class object
        String str = sc.nextLine();   //string creation
        int count[]= new int[str.length()];   //initializing the array that stores the string elements
        char freqArray[]=str.toCharArray();   
        for(int i=0;i<str.length();i++)  //reads the strings
        {
            count[i]=1;
            for(int j=i+1;j<str.length();j++)
            {
                if(freqArray[i]==freqArray[j])  //if array1 equals to array2 then it goes to countt++
                {
                    count[i]++;   
                    freqArray[j]='0';     
                }
            }
            if(freqArray[i]!='0' && freqArray[i]!=' ')   
            {
                System.out.println(freqArray[i]+" "+count[i] +" ");   //prints the frequency of the characters 
            }
            sc.close();  //scanner close
        }
        
    }
    
}
