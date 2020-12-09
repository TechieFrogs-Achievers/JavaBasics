package Arrays;

import java.util.Scanner;

public class DescendingOrder 
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in); //scanner class
        int length = sc.nextInt(); //input length
        int[] val = new int[length];
        for(int i=0;i<val.length;i++) //read the input
        {
            val[i]=sc.nextInt();
        }
        for(int i=0;i<val.length;i++)
        {
            for(int j=0;j<val.length;j++)
            {
                if(val[i]>val[j]) //condition
                {
                    int temp; //temp variable for storing data
                    temp=val[i];
                    val[i]=val[j];
                    val[j]=temp;

                }

            }
        }
        System.out.println("the elements in descending order");
        for(int i=0;i<val.length;i++)
        {
            System.out.println(val[i]); //prints the elements in descending order
        }
        sc.close();
        
    }
    
}
