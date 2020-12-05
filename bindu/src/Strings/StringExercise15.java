package Strings;

import java.util.Scanner;

public class StringExercise15 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the Sentence:");
        Scanner s = new Scanner(System.in);   //scanner object
        String str = s.nextLine();
        String Names[] = str.split(" ");   //splits the chars1
        String Names1 ="";   //stores the array values
        for(int i =0;i<Names.length;i++)
        {
            Names1+= Character.toUpperCase(Names[i].charAt(0))+Names[i].substring(1)+" ";   //converts the initial letters to caps
        }
        System.out.println(Names1);  //prints the final names
        s.close();

        
    }
    
}
