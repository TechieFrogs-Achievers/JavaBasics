package Strings;

import java.util.Scanner;

public class NequalParts 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);    //scanner class for user input
        String str = scan.nextLine();                     
        int length = str.length();    //length of string
        int noOfParts = scan.nextInt();                          
        int temp = 0;                   //temparary variable for stroting parts in a array
        String array[] = new String[noOfParts];   //string array creation
        int noOfChars = length/noOfParts;                       //the part contains how many values 
        
        if(length % noOfParts == 0)                             
        {
            //loop is iterated until string is there
            for(int i =0; i< str.length(); i = i+noOfChars)
            {
                String parts = str.substring(i, i+noOfChars);
                array[temp] = parts;     //that substring is stored in a array with index of temp value
                temp++;               
            }

            //loop is iteratd until the array size is there
            for(int i =0; i< array.length; i++)
            {
                System.out.println(array[i]);//printing that parts stored in array
            }
        }
        else
        {
            System.out.println("The string can't be divided into equal parts");
        }
        scan.close(); 
        
    
        
    }
    
}
