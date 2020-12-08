package StringExercises;

import java.util.Scanner;

public class StringProgram20 
{
    public static void main(String[] args) 
    {    

        // .......... String indexof &  string contains......//
        // String n1;
        // String n2;
        Scanner sc = new Scanner( System.in);
        System.out.println("Enter the names ");
        String n1 = sc.nextLine();
        String n2 = sc.nextLine();
       System.out.println(n1.indexOf('i'));//  it displays character position
       System.out.println(n1.indexOf(n2)); // it return value
       System.out.println(n1.contains(n2));// it return in boolean values
        sc.close();
        
        
    }
    
}
