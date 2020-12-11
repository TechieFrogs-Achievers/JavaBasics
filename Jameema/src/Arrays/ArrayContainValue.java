package Arrays;

import java.util.Scanner;

public class ArrayContainValue 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);   //scanner class
        int length = scan.nextInt();                            
        int array[] = new int[length];                          
        
        for(int i = 0; i < array.length; i++)
        {
            
            array[i] = scan.nextInt();  //reading array elements
        }
        System.out.println("Enter the number to check it is in array or not : ");
        int number = scan.nextInt();            
        boolean flag = false;
        for(int i = 0; i < array.length; i++)
        {
            
            if(array[i] == number)   //checking element is present in an array or not
            {
            
                flag = true;//if condition is true than it is incremented
            
            }
        }
        if(flag)        //if flag is incremented
        {
            System.out.println("The number is prsent in an array");
        }
        
        else   //if tha condition is not incremented 
        {
            System.out.println("The number is not prsent in an array");
        }
        scan.close();           
        
    }
    
}
