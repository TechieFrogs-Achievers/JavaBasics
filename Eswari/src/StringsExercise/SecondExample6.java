package StringsExercise;

import java.util.Scanner;

//class for dividing the string into 'N' equal parts
public class SecondExample6 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);                  //scanner class for user input
        String str = scan.nextLine();                       //creating string
        int length = str.length();                          //length of string
        int noOfParts = scan.nextInt();                         //how many parts to divide the string 
        int temp = 0;                                           //temparary variable for stroting parts in a array
        String array[] = new String[noOfParts];                 //string array creation
        int noOfChars = length/noOfParts;                       //the part contains how many values 
        
        //if the length of string is divided by no of parts then the inner block is excuted
        if(length % noOfParts == 0)                             
        {
            //loop is iterated until string is there
            for(int i =0; i< str.length(); i = i+noOfChars)
            {
                //the substring is stored parts: the substring contains until no of chars  
                String parts = str.substring(i, i+noOfChars);
                array[temp] = parts;                    //that substring is stored in a array with index of temp value
                temp++;                     //temp value is incremented
            }

            //loop is iteratd until the array size is there
            for(int i =0; i< array.length; i++)
            {
                System.out.println(array[i]);                   //printing that parts stored in array
            }
        }

        //if the length of string is not divided by no of parts then else block is excuted
        else
        {
            System.out.println("The string can't be divided into equal parts");
        }
        scan.close();               //scanner close
        
    }
    
}
