package Strings;

import java.util.Scanner;

public class FirstExample {
    public static void main(String[] g){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        int vowel=0, consonents=0,digits=0,spaces=0;

        //iterator to traverse along the sentence 
        for(int i=0; i<=str.length()-1; i++)
        {
            //condition to check no of vowels
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u' ){
            vowel++;
            }
            //condition to check no of consonents
            else if(str.charAt(i)>='a' && str.charAt(i)<='z'){
            consonents++;
            }
            //condition to check no of digits
            else if(str.charAt(i)>='0' && str.charAt(i)<='9'){
            digits++;
             }
             //condition to check no of spaces
             else if(str.charAt(i)==' '){
             spaces++;
             }
        }

        System.out.println("no of vowels in a given sentence :"+vowel);
        System.out.println("no of consonents in a given sentence :"+consonents);
        System.out.println("no of digits in a given sentence :"+digits);
        System.out.println("no of spaces in a given sentence :"+spaces);
        
    }
    

    
}
