package Strings;

import java.util.Scanner;

public class StringEqualparts 
{
    public static void main(String[] args) {
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in); //scanner class object
        String str = sc.nextLine();   //string creation
        int length=str.length();      //checks the string length
        int noOfparts=sc.nextInt();   //integer creation 
        int temp=0;
        String array[]=new String[noOfparts];    //stores the number of parts
        int noOfchars=length/noOfparts;  //divides the length by total no of parts 
        if(length%noOfparts==0)
        {
            for(int i=0;i<str.length();i=i+noOfchars)   //checks for the length of numberof chars
            {
                String parts=str.substring(i,i+noOfchars);   
                array[temp]=parts;    
                temp++;
            }
            for(int i=0;i<array.length;i++)
            {
                System.out.print (array[i]);   //prints the array length
            }
        }
        else
        {
            System.out.println("string can't be divided equal parts:");
        }
        sc.close();  //scanner close
    }
    
}
