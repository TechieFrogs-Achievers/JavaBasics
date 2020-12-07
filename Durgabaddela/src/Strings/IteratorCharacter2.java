package Strings;

import java.util.Scanner;

public class IteratorCharacter2 
{
    public static void main(String[] args)
     {
        
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the string");
    String s = sc.nextLine();
    char a[] = s.toCharArray();//converting string to char array
    for(char n:a)//for each loop for char array
    {
      System.out.print(n);//printing the charcters   
    }
    sc.close();
     }

    
    
}
