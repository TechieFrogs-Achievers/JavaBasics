package Arrays;

import java.util.Scanner;

public class ArrayExample21 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the elements:");
        Scanner sc = new Scanner(System.in);  //scanner class object
        int length = sc.nextInt();  //integer creation
        int val[]= new int[length];  //initializing the array to store the values
        for(int i=0;i<val.length;i++)
        {
            val[i]=sc.nextInt();   //reads the array elements
        }
        //loop for checking the next element 
        for(int i=0;i<length;i++)
        {
            for(int j=i+1;j<length;j++)
            {
                if(val[i] == val[j])   //if the values are equal then the duplicate value will be deleted
                {
                    for(int k=j;k<length-1;k++)  
                    {
                        val[k] = val[k+1];   //the value will be added to the next array element as array size will be decreased
                    }
                    length=length-1;  
                } 
            }
        }
        System.out.println("the duplicate elements in the array is:");
        for(int i=0;i<length;i++)  //prints the result 
        {
            System.out.print(val[i]+" ");
        }
        sc.close();  //scanner close

        
    }
    
}
