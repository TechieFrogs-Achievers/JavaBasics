package Strings;

import java.util.Scanner;
//iterating each and every charecter in a string
public class Frequency {
    public static void main(String[] jn){
        Scanner sc=new Scanner(System.in);
        String string=sc.nextLine();
        int noOfCharecters=0;

        //using for loop
        //iterator to iterate through the string
       /* for(int i=0; i<string.length();i++){
            System.out.println(string.charAt(i));
            ++noOfCharecters;
        }
       System.out.println(noOfCharecters); */

       //using for each loop
        char[] s=string.toCharArray();
        for(char c:s){
        System.out.println(c);
        ++noOfCharecters;
        }
        System.out.println(noOfCharecters);

    
    
    
    
    
    }




    
}
