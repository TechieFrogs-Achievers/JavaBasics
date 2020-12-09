package Arrays;

import java.util.Scanner;

public class ArrayExample1 
{
    public static void main(String[] args) 
    {
        System.out.println("enter the numbers:");
        Scanner sc =new Scanner(System.in);   //scanner class object
        int length = sc.nextInt();   //integer creation
        //intializing the array to store the values and length of the array
        int array1[] = new int[length];
        int array2[] = new int[length];
        //loop to check the array length
        for(int k=0;k<array1.length;k++)
        {
            //assigns the values to the array
            array1[k]=sc.nextInt();
        }
        //copies  the array1 values to the array2
        array2 =array1;   
        //loop to check the length of the array
        for(int l=0;l<array2.length;l++)
        {
            System.out.print(array2[l]+" ");   //prints the array2 values 
        }
        sc.close();   //scanner close
        
        
    }
    
}
