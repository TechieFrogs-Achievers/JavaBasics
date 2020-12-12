package Arrays;

import java.util.Scanner;

public class CharacterToString 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the length ");
        Scanner sc = new Scanner(System.in);   // scanner class
        int length = sc.nextInt();     //  Initiallizing length for array 
        System.out.println(" Enter the character :");
        char ch[] = new char[length];     //  array for storing character
        for( int i =0; i < length; i++)
        {
            ch[i] = sc.next().charAt(0);    // Reading characters 

        }
        String str = String.valueOf(ch);     // using method for converting character to string
        System.out.println(str);              // print string
        System.out.println();

        System.out.println(" String converting to character ");
        
        for( int i =0; i < length; i++)   // loop for checking the character
        {
             ch[i] = str.charAt(i);    // converting string to character
        }
        for( int i =0; i < length; i++)
        {
            System.out.print(ch[i]+ " ");  // printing
        }  
        sc.close();        // scanner class close
        
    }
    
}
