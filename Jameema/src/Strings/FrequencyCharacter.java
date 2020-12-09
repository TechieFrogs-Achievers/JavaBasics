package Strings;

import java.util.Scanner;

public class FrequencyCharacter 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the string ");
        Scanner sc = new Scanner(System.in);//scanner class
        String str = sc.nextLine(); // string variable
        int count[]= new int [str.length()];
        char freqArray[] = str.toCharArray();// separate the each character  from string 
        for( int i =0 ; i < str.length(); i++) // it checks the first character from  given string
        {
            count[i]=1;
            for(int j = i+1; j < str.length(); j++)// it checks the  next character 
            {
                if ( freqArray[i]==freqArray[j] )// if two characters are equal
                {
                    count[i]++;// increase
                    freqArray[j]= '0';//second character set to zero

                }
            }
            if(freqArray[i]!='0' && freqArray[i]!= ' ')// the count is greater than one than the frequency of character display
            {
                System.out.println(freqArray[i] + " "+count[i]+" ");
            }       
            
        }
        sc.close(); 
    }  
}
