package Arrays;

import java.util.Scanner;

public class SmallestElement 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in); //scanner class
        int length = sc.nextInt(); //length of array
        int[] val = new int[length];
        for(int i=0;i<val.length;i++)
        {
            val[i]=sc.nextInt(); //read the input values
        }
        int min=val[0]; //initialize the min value
        for(int i=0;i<val.length;i++)
        {
            if(val[i]<min)
            {
                min=val[i];
                
            }      
        }
        System.out.println("the largest value:" +min); //prints the min value in array
        sc.close();

        
    }
    
}
