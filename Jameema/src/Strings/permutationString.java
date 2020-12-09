package Strings;

import java.util.Scanner;

public class permutationString 
{
    public static String swapString(String str, int i, int j) 
    {    
        char[] a =str.toCharArray();   //string as characters 
        char temp;    //temp variable
        temp = a[i];    
        a[i] = a[j];    
        a[j] = temp;    
        return String.valueOf(a);    
    }    

    public static void Permutation(String str, int start, int end)    //generating different permutations of the string    
    {    
        //Prints the permutations    
        if (start == end-1)    
            System.out.println(str);    
        else    
        {    
            for (int i = start; i < end; i++)    
            {     
                str = swapString(str,start,i);    //Swapping the string by fixing a character   
                Permutation(str,start+1,end);        
                str = swapString(str,start,i);    //swapping the remaining characters again
            }    
        }    
    }    
        
    public static void main(String[] args)    
    {    
        Scanner sc = new Scanner(System.in); //scanner class
        String str = sc.nextLine();    
        int len = str.length();    
        System.out.println("All the permutations of the string are: ");    
        Permutation(str, 0, len);    
        sc.close(); //scanner close
    }       
}
