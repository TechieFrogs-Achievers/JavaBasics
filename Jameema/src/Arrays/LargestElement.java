package Arrays;

import java.util.Scanner;

public class LargestElement
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in); //scanner class
        int length = sc.nextInt(); //input length
        int[] val = new int[length];
        for(int i=0;i<val.length;i++) //reading inut value
        {
            val[i]=sc.nextInt();
        }
        int max=val[0]; //initilize the max value
        for(int i=0;i<val.length;i++)
        {
            if(val[i]>max) //checking condition
            {
                max=val[i];
                
            }      
        }
        System.out.println("the largest value:" +max); //printing the max value
        sc.close();
        
    }

}