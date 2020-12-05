package Strings; //Package
import java.util.*; //Scanner Class Package

public class CountNumber //class for CountNumber,vowels,consonants
{
    public static void main(String[] args) {
        int vowels=0,consnants=0,digits=0,spaces=0; // Datamembers
        //String line="Java is Programming Language.";
        Scanner sc=new Scanner(System.in); // Scanner class for taking input from keyboard
        String str=sc.nextLine(); //taking String from input 
        str=str.toLowerCase(); // String method for converting into lower case letter
        System.out.println(str);
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i); // String converting into characters
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') // cond for checking  vowels
            {
                vowels++;
            }
            else if(ch>='a' && ch<='z') // cond for consonants
            {
                consnants++;
            }
            else if(ch>='0' && ch<='9') // cond for digits
            {
                digits++;
            }
            else if(ch==' ') // cond for spaces
            {
                spaces++;
            }
            else
            {
                System.out.println("Special Characters:Invalid Sentence");
            }
        }
        System.out.println("Vowels:"+vowels);
        System.out.println("Consonants:"+consnants);
        System.out.println("Digits:"+digits);
        System.out.println("Spaces:"+spaces);
        sc.close(); // closing Scanner class
    }
}
