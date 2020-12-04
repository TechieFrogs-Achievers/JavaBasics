package StringExamples;

import java.util.Scanner;

public class Program1
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); 
        String  Sentence = sc.nextLine(); //taking input from keyboard
       int countv=0, countc = 0,counts = 0,countd =0;

            String str =Sentence.toLowerCase();//covert your string into lower case

       for(char i = 0; i<= str.length()-1;i++)//loop to check condition
       {   
           char ch = str.charAt(i);//string value given to char

            if(ch ==   'a'  || ch == 'e' || ch == 'i' ||  ch =='o' || ch == 'u') //to check vowels
            { 
                countv++;
                
            }  
            else if ((ch >= 'a')&& (ch <= 'z'))//for consonants
            {
                countc++;  
            }  
             else if ((ch >= '0')  && (ch <= '9'))
            {
                countd++;
            }

             else if(ch == ' ')
             {
                 counts++;

            }
       }     
        System.out.println("vpwels in sentence : " +countv);
        System.out.println("consonanats in a sentence : " +countc);
        System.out.println("spaces in a sentence :" +counts);
        System.out.println("Digits in sentence :  " +countd);
        sc.close();
        
    }
    
}
