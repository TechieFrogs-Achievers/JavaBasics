package Arrays;

import java.util.Scanner;

public class LeftRotation 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);    //scanner class 
        int length = scan.nextInt();              //length of array
        int val[] = new int[length];        //input data

        for(int i = 0; i < val.length; i++)               
        {
            val[i] = scan.nextInt();   //reading array elements
        }
        System.out.println("Enter how many positions to rotate in left side: ");
        int positions = scan.nextInt();             

        int temp;                   //temporary variable to swap the elements
        for(int i =0; i < positions; i++)
        {
            temp = val[0];            //assign the first element to temporary variable
            
            for(int j = 0; j < val.length-1; j++)
            {
                
                val[j] = val[j+1];              
            }
            val[val.length -1] =temp;           //the first element is assigned to last position of array
        }
        
        System.out.print("The array elemnets after left rotation is : ");

        for(int i =0 ; i < val.length; i++)
        {
            
            System.out.print(val[i] +" "); //print the result
        }
        scan.close();      
        
    }
    
}
