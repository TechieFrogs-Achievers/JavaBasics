package StringExercises2;

import java.util.Scanner;

public class StringPuntuations 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the  String");
        Scanner sc = new Scanner(System.in);//scanner class
        String str = sc.nextLine();
        int count = 0;
        for(int i= 0; i < str.length(); i++)
        {    
            // it checks these puntuations in string and it give count
            if(str.charAt(i)=='?'||str.charAt(i)==','||str.charAt(i)==';'||str.charAt(i)=='!'||str.charAt(i)=='@'||str.charAt(i)=='*'||str.charAt(i)=='.')//puntuations
            {
                count++;

            }
            
        }
        System.out.println(" the number of puntuations : " + count);
        sc.close();// closing scanner class
        
    }
    
}
