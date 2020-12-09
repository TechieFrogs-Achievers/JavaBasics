package Arrays;

import java.util.Scanner;

public class RemoveDuplicate 
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
        for(int i=0;i<val.length;i++) //check the condition
        {
            for(int j=i+1;j<val.length;j++)
            {
                if(val[i]!=val[j]) //true
                {
                    System.out.println("the duplicate values are:" +val[i]); //print the result
                }
            }

        }

        
    }
    
}
