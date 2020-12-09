package Strings;

import java.util.Scanner;

public class StringCharacterFrequency 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the string:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count[]= new int[str.length()];
        char freqArray[]=str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
            count[i]=1;
            for(int j=i+1;j<str.length();j++)
            {
                if(freqArray[i]==freqArray[j])
                {
                    count[i]++;
                    freqArray[j]='0';
                }
            }
            if(freqArray[i]!='0' && freqArray[i]!=' ')
            {
                System.out.println(freqArray[i]+" "+count[i] +" ");
            }
            sc.close();
        }
        
    }
    
}
