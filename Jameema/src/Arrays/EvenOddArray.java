package Arrays;

import java.util.Scanner;

public class EvenOddArray 
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
            if(val[i]%2==0) //modules of value is 0
            {
                System.out.println("the even array elements  :" +val[i]); //it prints the even value
            }
            // else
            // {
            //     System.out.println("the odd array elements  :" +val[i]);
                
            // }
            
        }
        for(int i=0;i<val.length;i++)
        { 
            if(val[i]%2!=0) //modules of value is not 0
            {
                System.out.println("the odd array elements  :" +val[i]); //it prints the odd valu
            }
            
        }
        sc.close();
        
    }
    
}
