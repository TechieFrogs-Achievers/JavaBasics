package Stringmethods;
import java.util.*;
public class StringExample4 
{
    public static void main(String[] args) 
    {
        int vCount = 0, cCount = 0;    
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter string:");  
         String str=sc.nextLine();
        
        //Converting entire string to lower case to reduce the comparisons    
        str = str.toLowerCase();    
            
        for(int i = 0; i < str.length(); i++) 
        {    
            //Checks whether a character is a vowel    
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {    
                //Increments the vowel counter    
                vCount++;    
            }    
            //Checks whether a character is a consonant    
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z')
            {      
                //Increments the consonant counter    
                cCount++;    
            }
    
        }
        System.out.println("The vowel count: "+vCount);
        System.out.println("The consonant count: "+cCount);
        }    

}
