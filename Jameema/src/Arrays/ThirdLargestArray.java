package Arrays;

import java.util.Scanner;

public class ThirdLargestArray 
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
            for(int j=i+1;j<val.length;j++)
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
        System.out.println("the third largest element  :"+(val[val.length-3]));    //prints the the 3rd largest element 
        sc.close();
        
        
    }
    
}
