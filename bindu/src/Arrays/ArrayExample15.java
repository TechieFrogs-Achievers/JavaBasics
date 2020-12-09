package Arrays;

import java.util.Scanner;

public class ArrayExample15 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the elements:");
        Scanner sc = new Scanner(System.in);  //scanner class object
        int length = sc.nextInt();  //integer creation
        int num[]=new int[length];   //stores the array elements
        for(int i=0;i<num.length;i++)  
        {
            num[i]=sc.nextInt();     //reads the array elements
        }
        for(int i=0;i<num.length;i++)
        {
            for(int j=0;j<num.length;j++)   
            {
                if(num[i]>num[j])   //checks the condition 
                {
                    int temp;   //swapping the elements
                    temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
        }
        System.out.println("the elements in descending order is:");  //prints the order
        for(int i=0;i<num.length;i++)   
        {
            System.out.println(num[i]);   //prints the descending order
            sc.close();  //scanner close
        }
        
    }
    
}
