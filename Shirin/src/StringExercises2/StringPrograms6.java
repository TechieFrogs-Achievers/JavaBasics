package StringExercises2;

import java.util.Scanner;

public class StringPrograms6 
{
    public static void main(String[] args) 
    {   
        System.out.println("Enter the string :");
        Scanner sc = new Scanner(System.in);//scanner class 
        String str = sc.nextLine();// string variable
        int length = str.length();//length of the string
        int numOfParts = sc.nextInt();// dividing the numofparts from the string           
        int temp = 0;// variable for storing numofparts in array
        String array[] = new String[numOfParts];//array 
        int numOfChars = length/numOfParts;
        

        if(length % numOfParts == 0) // length of the string is divided into no of parts                            
        {
           
            for(int i =0; i< str.length(); i = i+numOfChars) //loop for iterating the string until it string divides
            {
                 
                String parts = str.substring(i, i+numOfChars);// the substring contains until no of chars 
                array[temp] = parts; //that substring is stored in a array with  in index of temp 
                temp++;      
            }

            
            for(int i =0; i< array.length; i++)// loop for iterating the array size
            {
                System.out.println(array[i]);//printing the parts are stored in array
            }
        }

        
        else// length of the string is not divided by no of parts
        {
            System.out.println("The string can't be divided into equal parts");
        }
        sc.close(); // closing scanner class       
        
    }
        
    
    
}
